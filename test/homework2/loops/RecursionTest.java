package homework2.loops;

import homework2.loops.Recursion;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RecursionTest {

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    public void checkRecursionFactorial(int number, long factorial){
        assertEquals(factorial, Recursion.factorialWithRecursion(number));
    }

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                arguments(9 ,362880),
                arguments(16, 20922789888000L),
                arguments(20, 2432902008176640000L)
        );
    }
}
