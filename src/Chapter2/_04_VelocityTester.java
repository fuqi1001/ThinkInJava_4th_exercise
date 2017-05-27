package Chapter2;

/**
 * Created by qifu on 17/5/26.
 */
// Write a program that calculates velocity using a constant distance
// and a constant time.

class VelocityCalculator {
    static float compute(float d, float t) {
        if(t == 0) return 0f;
        else return d/t;
    }
}
public class _04_VelocityTester {
    public static void main(String[] args) {
        float d = 233.3f;
        float t = 5.5f;
        System.out.println("Distance: " + d);
        System.out.println("Time: "+ t);
        float v = VelocityCalculator.compute(d,t);
        System.out.println("Speed: " + v);
    }
}

/*
Output:
Distance: 233.3
Time: 5.5
Speed: 42.418182
 */