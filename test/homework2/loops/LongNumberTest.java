package homework2.loops;

import homework2.loops.LongNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongNumberTest {

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    public void checkLongNumberOverflow(long originalNumber, int multiplier, long[] result){
        assertArrayEquals(result, LongNumber.beforeAfterOverflow(originalNumber, multiplier));
    }

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                arguments(6, 6, new long []{4738381338321616896L, -8463200117489401856L}),
                arguments(8888889999999999999L, 5, new long []{3086283813424962959L, -3015325006584736821L})
        );
    }
}
