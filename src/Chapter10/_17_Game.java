package Chapter10;

import java.util.Random;

/**
 * Created by qifu on 17/7/18.
 */
interface Games {
    void play();
}
interface GamesFactory{
    Games getGames();
}

class CoinToss implements Games {
    Random rand = new Random();

    @Override
    public void play() {
        System.out.println("Toss Coin: ");
        switch (rand.nextInt(2)) {
            case 0: System.out.println("Head"); return;
            case 1: System.out.println("Tails"); return;
            default: System.out.println("OnEdge"); return;
        }
    }
    public static GamesFactory factory =
            new GamesFactory() {
                @Override
                public Games getGames() {
                    return new CoinToss();
                }
            };
}

class DiceThrow implements Games {
    Random rand = new Random();

    @Override
    public void play() {
        System.out.println("Throw Dice: " + (rand.nextInt(6) + 1));
    }
    public static GamesFactory factory =
            new GamesFactory() {
                @Override
                public Games getGames() {
                    return new DiceThrow();
                }
            };
}

public class _17_Game {
    public static void playGame(GamesFactory factory) {
        Games g = factory.getGames();
        g.play();
    }
    public static void main(String[] args) {
        playGame(CoinToss.factory);
        playGame(DiceThrow.factory);
    }
}
