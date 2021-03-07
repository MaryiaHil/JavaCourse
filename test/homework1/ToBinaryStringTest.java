package homework1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToBinaryStringTest {

    @Test
    public void checkConversionToBinary(){
        assertEquals("00101010", ToBinaryString.toBinaryString((byte)42));
        assertEquals("00001111", ToBinaryString.toBinaryString((byte)15));
        assertEquals("11010110", ToBinaryString.toBinaryString((byte)-42));
        assertEquals("11110001", ToBinaryString.toBinaryString((byte)-15));
    }
}
