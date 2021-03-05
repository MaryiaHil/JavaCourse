package homework2.loops;

import homework2.loops.MultiplicationTable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MultiplicationTableTest {
    @ParameterizedTest
    @MethodSource("argumentsProvider")
    public void checkNumberExponentiation(int fromNumber, int toNumber, String result){
        assertEquals(result, MultiplicationTable.fillMultiplicationTable(fromNumber, toNumber));
    }

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                arguments(1, 2, " 1 x 1 = 1  |\n" +
                        " 1 x 2 = 2  |\n" +
                        " 1 x 3 = 3  |\n" +
                        " 1 x 4 = 4  |\n" +
                        " 1 x 5 = 5  |\n" +
                        " 1 x 6 = 6  |\n" +
                        " 1 x 7 = 7  |\n" +
                        " 1 x 8 = 8  |\n" +
                        " 1 x 9 = 9  |\n" +
                        " 1 x 10 = 10|\n"),
                arguments(4, 5, " 4 x 1 = 4  |\n" +
                        " 4 x 2 = 8  |\n" +
                        " 4 x 3 = 12 |\n" +
                        " 4 x 4 = 16 |\n" +
                        " 4 x 5 = 20 |\n" +
                        " 4 x 6 = 24 |\n" +
                        " 4 x 7 = 28 |\n" +
                        " 4 x 8 = 32 |\n" +
                        " 4 x 9 = 36 |\n" +
                        " 4 x 10 = 40|\n")
        );
    }
}
