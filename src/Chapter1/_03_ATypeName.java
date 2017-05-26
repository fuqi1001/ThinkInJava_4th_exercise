package Chapter1;

/**
 * Created by qifu on 17/5/25.
 */
/*

Find the code fragments involving ATypeName and turn them into a program that compiles and runs.
 */

public class _03_ATypeName {
    static class AtypeName {
        int a;
        double b;
        char c;
        void show() {
            System.out.println("a: "+a);
            System.out.println("b: "+b);
            System.out.println("c: "+c);
        }
    }
    public static void main(String[] args){
        AtypeName temp = new AtypeName();
        temp.a = 1;
        temp.b = 0.1;
        temp.c = 'c';
        temp.show();
    }
}
/*
output:
a: 1
b: 0.1
c: c
 */
