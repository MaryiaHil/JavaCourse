package homework2.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongNumberTest {

    @Test
    public void checkLongNumberOverflow(){
        assertArrayEquals(new long []{4052555153018976267L, -6289078614652622815L},
                LongNumber.beforeAfterOverflow(1, 3));
        assertArrayEquals(new long []{1560496482665168896L, -1774566438301073408L},
                LongNumber.beforeAfterOverflow(1, 188));
        assertArrayEquals(new long []{-799006685782884121L, 3265617043834753317L},
                LongNumber.beforeAfterOverflow(1, -19));
        assertArrayEquals(new long []{3133711272077241920L, -2778187713323342016L},
                LongNumber.beforeAfterOverflow(1000000, 5));
    }
}
