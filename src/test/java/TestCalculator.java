import static org.junit.Assert.*;
import org.junit.Test;
public class TestCalculator {
    private static final double DELTA = 1e-15;
    Calculator cal = new Calculator();

    @Test
    public void sqrtTruePositive(){
        assertEquals("Square rooting number for True Positive", 4, cal.square_root(16), DELTA);
        assertEquals("Square rooting number for True Positive", 100.0031249511734, cal.square_root(10000.625), DELTA);
    }

    @Test
    public void sqrtFalsePositive(){
        assertNotEquals("Square rooting number for False Positive",4.1, cal.square_root(16), DELTA);
        assertNotEquals("Square rooting number for False Positive", 25.5, cal.square_root(625), DELTA);
    }

    @Test
    public void factTruePositive(){
        assertEquals("Factorial number for True Positive", 120, cal.factorial(5), DELTA);
        assertEquals("Factorial number for True Positive", 6, cal.factorial(3), DELTA);
    }

    @Test
    public void factFalsePositive(){
        assertNotEquals("Factorial for False Positive",120, cal.factorial(11), DELTA);
        assertNotEquals("Factorial for False Positive", 6, cal.factorial(12), DELTA);
    }


}
