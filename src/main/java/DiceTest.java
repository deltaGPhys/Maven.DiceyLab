import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void tossAndSumTest() {

        Dice dice = new Dice(10);

        for (int i = 0; i<10000; i++ ){
            Integer sum = dice.tossAndSum();
            Assert.assertTrue(sum >= 10);
            Assert.assertTrue(sum <= 60);
        }
    }

    @Test
    public void constructorTest() {

        Random random = new Random();
        Integer n = random.nextInt(1000)+1;
        Dice dice = new Dice(n);

        Assert.assertEquals(n, dice.getN());

    }
}