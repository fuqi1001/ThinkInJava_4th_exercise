package Chapter9;

/**
 * Created by qifu on 17/7/14.
 */
interface Instrument_ {
    int VALUE = 5;
    void adjust();
}
interface Playable {
    void play(Note n);
}

class Wind_ implements Instrument_, Playable {
    @Override
    public void adjust() {
        System.out.println(this+".adjust()");
    }

    @Override
    public void play(Note n) {
        System.out.println(this+".play()" + n);
    }

    public String toString() {
        return "Wind";
    }
}
class Percussion_ implements Instrument_, Playable {
    @Override
    public void adjust() {
        System.out.println(this+".adjust()");
    }

    @Override
    public void play(Note n) {
        System.out.println(this+".play()" + n);
    }

    public String toString() {
        return "Percussion";
    }
}
class Stringed_ implements Instrument_, Playable {
    @Override
    public void adjust() {
        System.out.println(this+".adjust()");
    }

    @Override
    public void play(Note n) {
        System.out.println(this+".play()" + n);
    }

    public String toString() {
        return "Stringed";
    }
}

class Brass_ extends Wind_ {
    public String toString() {
        return "Brass";
    }
}

class Woodwind_ extends Wind_{
    public String toString(){
        return "Woodwind";
    }
}
public class _10_Music10 {
    static void tune(Playable p) {
        p.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] p) {
        for(Playable cur : p) {
            tune(cur);
        }
    }

    public static void main(String[] args) {
        Playable[] orc = {
                new Wind_(),
                new Percussion_(),
                new Stringed_(),
                new Brass_(),
                new Woodwind_()
        };
        tuneAll(orc);
    }
}
