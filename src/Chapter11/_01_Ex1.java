package Chapter11;

import java.util.ArrayList;

/**
 * Created by qifu on 17/7/20.
 */
class Gerbil {
    private int gerbilNumber;
    public Gerbil(int i ) {
        gerbilNumber = i;
    }
    public void hop() {
        System.out.println("Gerbil " + gerbilNumber +" hops");
    }
}
public class _01_Ex1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for(int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i));
        }
        for(int i = 0; i < 10; i++) {
            gerbils.get(i).hop();
        }

        for(Gerbil cur : gerbils){
            cur.hop();
        }
    }
}
