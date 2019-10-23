package mycodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarmUpTest {

    @Test
    public void sAlphabet() {
        WarmUp w = new WarmUp();
        String generated = w.sAlphabet(10);
        char charAt0 = generated.charAt(0);
        boolean cond = (charAt0 >= 'A' && charAt0 <= 'Z') || (charAt0 >= 'a' && charAt0 <= 'z');
        assertTrue(cond);
    }

}