import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    @Test
    void incrementBin() {
        Bins bin = new Bins(2, 12);
        Integer expected =1;

        bin.incrementBin(10);
        Integer actual = bin.getBins(10);

        Assert.assertEquals(expected, actual);

    }

    @Test
    void getBins() {
        Bins bin = new Bins(2, 12);
        Integer expected =1;

        bin.incrementBin(7);
        Integer actual = bin.getBins(7);

        Assert.assertEquals(expected, actual);
    }
}