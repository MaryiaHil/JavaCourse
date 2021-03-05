package homework2.loops;

import homework2.loops.Exponentiation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ExponentiationTest {

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    public void checkNumberExponentiation(double number, double power, double result){
        assertEquals(result, Exponentiation.exponentNumber(number, power));
    }

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                arguments(4, 2, 16),
                arguments(9, 7, 4782969),
                arguments(12, 4, 20736)
        );
    }
}
