package homework2.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExponentiationTest {

    @Test
    public void checkNumberExponentiation(){
        assertEquals(1889568.0, Exponentiation.exponentNumber(18.0, 5));
        assertEquals(56.25, Exponentiation.exponentNumber(7.5, 2));
        assertEquals(16, Exponentiation.exponentNumber(4, 2));
        assertEquals(-4782969, Exponentiation.exponentNumber(-9, 7));
    }

}
