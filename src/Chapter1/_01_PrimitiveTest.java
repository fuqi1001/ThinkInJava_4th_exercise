package Chapter1;

/**
 * Created by qifu on 17/5/25.
 */
/*
Create a class containing an int and a char that are not intitialized
and print their values to verify that Java performs default initialization.
 */
public class _01_PrimitiveTest {
    static int a;
    static char b;
    public static void main(String[] args) {
        System.out.println("Default int = "+a);
        System.out.println("Default char = "+b);
    }
}

/*
output:
Default int = 0
Default char =  
 */