package Chapter8;

/**
 * Created by qifu on 17/7/13.
 */
class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }
    protected void finalize() {
        if(refcount > 0) {
            System.out.println("Error: " + refcount + " Shared " + id + " Objects in use");
        }
    }
    protected void dispose() {
        if(--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        System.out.println("creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }
    public String toString() {
        return "Composing " + id;
    }
}
public class _13_ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] comp = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };
        for(Composing c : comp) {
            c.dispose();
        }

        Composing compTest = new Composing(shared);
        Composing compTest1 = new Composing(shared);

        //test finalize();

        shared.finalize();
        //Test sharedTest finalize()
        Shared sharedTest = new Shared();
        Composing compTest3 = new Composing(sharedTest);
        sharedTest.finalize();
    }
}

