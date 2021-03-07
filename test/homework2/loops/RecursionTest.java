package homework2.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursionTest {

    @Test
    public void checkRecursionFactorial(){
        assertEquals(362880, Recursion.factorialWithRecursion(9));
        assertEquals(20922789888000L, Recursion.factorialWithRecursion(16));
        assertEquals(2432902008176640000L, Recursion.factorialWithRecursion(20));
    }
}
