import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DiceTest {
    @Test
    public void testTossAndSum() {
        Dice dice = new Dice(2); // create object
        int toss = dice.tossAndSum(); // assign method to int variable
        Assert.assertTrue(toss >= 2 && toss <= 12); // Assert.assertTrue to test condition
    }
    @Test
    public void testTossAndSum2() {
        Dice dice = new Dice (4);
        int toss = dice.tossAndSum();
        Assert.assertTrue(toss >= 4 && toss <= 24);
    }


}