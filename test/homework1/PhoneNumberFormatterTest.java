package homework1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PhoneNumberFormatterTest {

    @ParameterizedTest(name = "{index} arr = {0}, результат ожидаем {1}")
    @MethodSource("multipleArgumentProvider")
    public void checkPhoneFormat(int[] arr, String str){
        assertEquals(str, PhoneNumberFormatter.createPhoneNumber(arr));
    }

    static Stream<Arguments> multipleArgumentProvider() {
        return Stream.of(
                arguments((new int [] {0, 2, 9, 2, 8, 1, 2, 1, 3, 3}),"(029) 281-2133"),
                arguments(new int [] {0, 2, 9, 2, 8, 1, 2}, "Wrong phone number. The amount of digits should be 10"),
                arguments(new int [] {0, 23, 99, 27, 8, 1, 2}, "Wrong phone number. The amount of digits should be 10")
        );
    }
}
