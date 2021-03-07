package homework2.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgumentFactorialTest {

    @Test
    public void checkFactorial(){
        assertEquals("1 * 2 * 3 * 4 * 5 = 120", ArgumentFactorial.factorial(5));
        assertEquals("1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040", ArgumentFactorial.factorial(7));
        assertEquals("1", ArgumentFactorial.factorial(0));
        assertEquals("Enter another number", ArgumentFactorial.factorial(-1));
    }

}
