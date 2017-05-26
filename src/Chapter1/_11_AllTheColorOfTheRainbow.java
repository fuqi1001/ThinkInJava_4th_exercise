package Chapter1;

/**
 * Created by qifu on 17/5/25.
 */
// Turn the AllColorsOfTheRainbow into a program that compiles and runs.

public class _11_AllTheColorOfTheRainbow {
    public static void main(String[] args) {
        AllTheColorOfTheRainbow rainBow = new AllTheColorOfTheRainbow();
        System.out.println("rainBow.anIntegerRepresentingColors = " + rainBow.anIntegerRepresentingColors);
        rainBow.changeColor(7);
        rainBow.changeTheHueOfTheColor(7);
        System.out.println("After change color rainBow.anIntegerRepresentingColors = " + rainBow.anIntegerRepresentingColors);
        System.out.println("rainBow.hue = " + rainBow.hue);
    }
}
class AllTheColorOfTheRainbow {
    int anIntegerRepresentingColors = 0;
    int hue = 0;
    void changeTheHueOfTheColor(int newHue) {
        hue = newHue;
    }
    int changeColor(int newColor) {
        return anIntegerRepresentingColors = newColor;
    }
}

/*
output:
rainBow.anIntegerRepresentingColors = 0
After change color rainBow.anIntegerRepresentingColors = 7
rainBow.hue =
 */
