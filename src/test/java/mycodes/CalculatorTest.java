package mycodes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void add() {
        assertEquals(4,  calculator.add(2, 2));
    }

    @Test
    public void sub() {
        assertEquals(4,  calculator.sub(6, 2));
    }

    @Test
    public void mul() {
        assertEquals(6,  calculator.mul(3, 2));
    }

    @Test
    public void div() {
        assertEquals(4,  calculator.div(16, 4));
    }
}