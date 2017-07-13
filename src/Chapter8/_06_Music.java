package Chapter8;

/**
 * Created by qifu on 17/7/13.
 */
class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }
    public String toString() {
        return "Instrument";
    }
    void adjust() {
        System.out.println("Adjustring Instrument");
    }
}
class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
    public String toString() {
        return "Wind";
    }
    void adjust() {
        System.out.println("Wind.adjust()");
    }
}
class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() "+ n);
    }
    public String toString() {
        return "Percussion";
    }
    void adjust() {
        System.out.println("adjust Percussion");
    }
}
class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() "+ n);
    }
    public String toString() {
        return "Stringed";
    }
    void adjust() {
        System.out.println("adjust Stringed");
    }
}
class Brass extends Instrument {
    void play(Note n) {
        System.out.println("Brass.play() "+ n);
    }
    public String toString() {
        return "Brass";
    }
    void adjust() {
        System.out.println("adjust Brass");
    }
}
class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() "+ n);
    }
    public String toString() {
        return "Woodwind";
    }
}
public class _06_Music3 {
    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
        for(Instrument i: orchestra) {
            System.out.println(i);
        }
    }
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument cur : e) {
            tune(cur);
        }
    }
}