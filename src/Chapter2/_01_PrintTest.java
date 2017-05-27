package Chapter2;

/**
 * Created by Crino on 2017/5/26.
 */
// Write a program that uses the "short" and long form of print statement

import static net.mindview.util.Print.*;
import org.greggordon.tools.*;

public class _01_PrintTest {
    public static void main(String[] args) {
        print("Hello, from short form.");
        P.rintln("Hello from greggordon form.");
        System.out.println("Hello from long form.");
    }
}
