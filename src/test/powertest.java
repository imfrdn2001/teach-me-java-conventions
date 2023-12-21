package powerpackage;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PowerTest {
    @Test
    public void testOneRaisedToOneIsOne() {
        Assertions.assertEquals(1, PowerFinder.calculatePower(1, 1));
    }

    @Test
    public void testTwoRaisedToOneIsTwo() {
        Assertions.assertEquals(2, PowerFinder.calculatePower(2, 1));
    }

    @Test
    public void testTwoPowerTwoIsFour() {
        Assertions.assertEquals(4, PowerFinder.calculatePower(2, 2));
    }

    @Test
    public void testPowerOfThreeAndTwoIsNine() {
        Assertions.assertEquals(9, PowerFinder.calculatePower(3, 2));
    }
}
