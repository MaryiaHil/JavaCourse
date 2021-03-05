package homework1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ToBinaryStringTest {

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    public void checkConversionToBinary(byte number, String binNumber){
        assertEquals(binNumber, ToBinaryString.toBinaryString(number));
    }

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                arguments((byte)42, "00101010"),
                arguments((byte)15, "00001111"),
                arguments((byte)-42, "11010110"),
                arguments((byte)-15, "11110001")
        );
    }
}
