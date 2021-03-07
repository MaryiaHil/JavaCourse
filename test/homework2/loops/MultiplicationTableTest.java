package homework2.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {
    @Test
    public void checkNumberExponentiation(){
        assertEquals(" 1 x 1 = 1  |\n" +
                " 1 x 2 = 2  |\n" +
                " 1 x 3 = 3  |\n" +
                " 1 x 4 = 4  |\n" +
                " 1 x 5 = 5  |\n" +
                " 1 x 6 = 6  |\n" +
                " 1 x 7 = 7  |\n" +
                " 1 x 8 = 8  |\n" +
                " 1 x 9 = 9  |\n" +
                " 1 x 10 = 10|\n", MultiplicationTable.fillMultiplicationTable(1, 2));
    }
}
