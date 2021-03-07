package homework2.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyAllDigitsTest {

    @Test
    public void checkAllDigitsMultipliedInNumber(){
        assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080",
                MultiplyAllDigits.multiplyAllDigits(181232375));
        assertEquals("2 * 3 * 4 = 24", MultiplyAllDigits.multiplyAllDigits(234));
        assertEquals("2 = 2", MultiplyAllDigits.multiplyAllDigits(2));
        assertEquals("9 * 9 * 9 * 8 * 3 * 5 * 4 * 7 = 2449440",
                MultiplyAllDigits.multiplyAllDigits(99983547));
    }

}
