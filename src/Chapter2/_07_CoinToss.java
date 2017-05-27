package Chapter2;

import java.util.Random;

/**
 * Created by qifu on 17/5/26.
 */
// Write a program that simulates coin-flipping

public class _07_CoinToss {
    public static void main(String[] args) {
        Random random = new Random();
        int coin = random.nextInt();
        if(coin % 2 == 0) System.out.println("heads");
        else System.out.println("tails");
    }
}
