package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall(){
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(100) +1;
        return new Ball (randomColor,randomNumber );
    }
}
