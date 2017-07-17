package Chapter9;

import java.util.Random;

/**
 * Created by qifu on 17/7/17.
 */
interface Game {
    void play();
}
interface GameFactory {
    Game getGame();
}

class CoinToss implements Game {
    Random rand = new Random();

    @Override
    public void play() {
        System.out.println("Toss coin: ");
        switch (rand.nextInt(2)) {
            case 0: System.out.println("Heads"); return;
            case 1: System.out.println("Tails"); return;
            default: System.out.println("OnEdge"); return;
        }
    }
}
class CoinTossFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new CoinToss();
    }
}
class DiceThrow implements Game {
    Random rand = new Random();
    @Override
    public void play() {
        System.out.println("Throw Dice: " + (rand.nextInt(6) + 1));
    }
}

class DiceThrowFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new DiceThrow();
    }
}
public class Games {
    public static void playGame(GameFactory gf) {
        Game g = gf.getGame();
        g.play();
    }
    public static void main(String[] args) {
        playGame(new CoinTossFactory());
        playGame(new DiceThrowFactory());
    }
}
