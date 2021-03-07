package homework2.arrays;

import homework2.arrays.api.IArraysOperation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ArrayOperationsTest {

    @ParameterizedTest
    @MethodSource("operationsProvider")
    public void checkAllArrayElements(IArraysOperation operation) {
        assertEquals("1 2 3 4 5 ", operation.allArrayElements(new int[]{1, 2, 3, 4, 5}));
    }

    @ParameterizedTest
    @MethodSource("operationsProvider")
    public void checkEachSecondElement(IArraysOperation operation) {
        assertEquals("2 4 ", operation.eachSecondElement(new int[]{1, 2, 3, 4, 5}));
    }

    @ParameterizedTest
    @MethodSource("operationsProvider")
    public void checkReverseOrderArray(IArraysOperation operation) {
        assertEquals("5 4 3 2 1 ", operation.reverseOrderArray(new int[]{1, 2, 3, 4, 5}));
    }

    static Stream<Arguments> operationsProvider() {
        return Stream.of(
                arguments(new WhileOperation()),
                arguments(new DoWhileOperation()),
                arguments(new ForOperation()),
                arguments(new ForEachOperation())
        );
    }
}
