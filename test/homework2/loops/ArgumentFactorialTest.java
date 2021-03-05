package homework2.loops;

import homework2.loops.ArgumentFactorial;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ArgumentFactorialTest {

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    public void checkFactorial(int number, String factorial){
        assertEquals(factorial, ArgumentFactorial.factorial(number));
    }

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                arguments(5 ,"1 * 2 * 3 * 4 * 5 = 120"),
                arguments(7, "1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040"),
                arguments(10, "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800")
        );
    }
}
