import static org.junit.Assert.*;
import org.junit.Test;
public class TestCalculator {
    private static final double DELTA = 1e-6;
    Calculator cal = new Calculator();

    @Test
    public void sqrtTruePositive(){
        assertEquals("Square rooting number for True Positive", 4, cal.square_root(16), DELTA);
        assertEquals("Square rooting number for True Positive", 100.00312495117, cal.square_root(10000.625), DELTA);
    }

    @Test
    public void sqrtFalsePositive(){
        assertNotEquals("Square rooting number for False Positive",4.1, cal.square_root(16), DELTA);
        assertNotEquals("Square rooting number for False Positive", 25.5, cal.square_root(625), DELTA);
    }

    @Test
    public void factTruePositive(){
        assertEquals("Factorial for True Positive", 120, cal.factorial(5), DELTA);
        assertEquals("Factorial for True Positive", 6, cal.factorial(3), DELTA);
    }

    @Test
    public void factFalsePositive(){
        assertNotEquals("Factorial for False Positive",120, cal.factorial(11), DELTA);
        assertNotEquals("Factorial for False Positive", 6, cal.factorial(12), DELTA);
    }
//    3.806662 45
    @Test
    public void logTruePositive(){
        assertEquals("Natural log for True Positive", 3.806662, cal.Natural_logarithm(45), DELTA);
        assertEquals("Natural log for True Positive", 3.9512437, cal.Natural_logarithm(52), DELTA);
    }
    @Test
    public void logFalsePositive(){
        assertNotEquals("Natural log for False Positive", 3.816662, cal.Natural_logarithm(45), DELTA);
        assertNotEquals("Natural log for False Positive", 3.9412437, cal.Natural_logarithm(52), DELTA);
    }


}
