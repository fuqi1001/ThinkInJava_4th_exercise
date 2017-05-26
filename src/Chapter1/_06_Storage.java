package Chapter1;

/**
 * Created by qifu on 17/5/25.
 */
// Write a program that includes and calls the storage() method defined as a
// code fragment in this chapter.

public class _06_Storage {
    public static void main(String[] args) {
        class Storage {
            int storage(String str) {
                return str.length() * 2;
            }
        }
        Storage obj = new Storage();
        System.out.println(obj.storage("hi"));
    }
}

/*
output:
4
 */
