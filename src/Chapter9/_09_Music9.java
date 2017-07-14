package Chapter9;

/**
 * Created by qifu on 17/7/14.
 */
abstract class Instrument {
    private int i;
    public abstract void play(Note n);
    public String toString() {
        return "Instrument";
    }
    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n );
    }

    @Override
    public void adjust() {
        System.out.println(this+".adjust()");
    }

    public String toString() {
        return "Wind";
    }
}
class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n );
    }

    @Override
    public void adjust() {
        System.out.println(this+".adjust()");
    }

    public String toString() {
        return "Percussion";
    }
}
class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n );
    }

    @Override
    public void adjust() {
        System.out.println(this+".adjust()");
    }

    public String toString() {
        return "Stringed";
    }
}
class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}
class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}

public class Music9 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for(Instrument cur : e) {
            tune(cur);
        }
    }

    public static void main(String[] args) {
        Instrument[] orc =  {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orc);

    }
}
