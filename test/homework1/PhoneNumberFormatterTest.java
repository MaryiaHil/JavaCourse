package homework1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberFormatterTest {

    @Test
    public void checkPhoneFormat(){
        assertEquals("(029) 281-2133",
                PhoneNumberFormatter.createPhoneNumber(new int [] {0, 2, 9, 2, 8, 1, 2, 1, 3, 3}));
        assertEquals("Wrong phone number. The amount of digits should be 10",
                PhoneNumberFormatter.createPhoneNumber(new int [] {0, 2, 9, 2, 8, 1, 2}));
        assertEquals("Wrong phone number. The amount of digits should be 10",
                PhoneNumberFormatter.createPhoneNumber(new int [] {0, 23, 99, 27, 8, 1, 2}));
    }

}
