package homework1;

public class BitwiseOperatorsWithNegative {
    public static void main(String[] args) {
        int a = -42;
        int b = -15;
        int result;
        System.out.println(a + " to binary: " + Integer.toBinaryString(a)); // 11010110
        System.out.println(b + " to binary: " + Integer.toBinaryString(b)); // 11110001

        // NOT(~) with negative numbers
        result = ~a;
        System.out.println("NOT: -42 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // ~11010110 = 00101001
        result = ~b;
        System.out.println("NOT: -15 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // ~11110001 = 00001110

        // AND(&) with negative numbers
        result = a & b;
        System.out.println("AND: -42 & -15 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // 11010110 & 11110001 = 11010000

        // AND,ASSIGNMENT(&=) with negative numbers
        a &= b;
        System.out.println("AND,ASSIGNMENT: -42 &= -15 = " + a + " (binary: "
                + Integer.toBinaryString(a) + ")");
        // 11010110 &= 11110001 = 11010000
        a = -42;

        // OR(|) with negative numbers
        result = a | b;
        System.out.println("OR: -42 | -15 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // 11010110 | 11110001 = 11110111

        // OR,ASSIGNMENT(|=) with negative numbers
        b |= a;
        System.out.println("OR,ASSIGNMENT: -15 |= -42 = " + b + " (binary: " + Integer.toBinaryString(b) + ")");
        // 11010110 |= 11110001 = 11110111
        b = -15;

        // XOR(^) with negative numbers
        result = a ^ b;
        System.out.println("XOR: -42 ^ -15 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // 11010110 ^ 11110001 = 00100111

        // XOR,ASSIGNMENT(^=) with negative numbers
        a ^= b;
        System.out.println("XOR,ASSIGNMENT: -42 ^= -15 = " + a + " (binary: "
                + Integer.toBinaryString(a) + ")");
        // 11010110 ^= 11110001 = 00100111
        a = -42;

        // RIGHT SHIFT (>>) with negative numbers
        // Used shift by 2 positions for both variables to get more representative results
        result = a >> 2;
        System.out.println("RIGHT SHIFT: -42 >> 2 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // 11010110 >> 2 = 11110101
        result = b >> 2;
        System.out.println("RIGHT SHIFT: -15 >> 2 = " + result + " (binary: "
                + Integer.toBinaryString(result) + ")");
        // 11110001 >> 2 = 11111100

        // RIGHT SHIFT,ASSIGNMENT (>>=) with negative numbers
        a >>= 2;
        System.out.println("RIGHT SHIFT,ASSIGNMENT: -42 >>= 2 = " + a + " (binary: "
                + Integer.toBinaryString(a) + ")");
        // 11010110 >>= 2 = 11110101
        b >>= 2;
        System.out.println("RIGHT SHIFT,ASSIGNMENT: -15 >>= 2 = " + b + " (binary: "
                + Integer.toBinaryString(b) + ")");
        // 11110001 >>= 2 = 11111100
        a = -42;
        b = -15;

        // ZERO FILL RIGHT SHIFT(>>>) with negative numbers
        result = a >>> 2;
        System.out.println("ZERO FILL RIGHT SHIFT: -42 >>> 2 = " + result + " (binary: "
                + Integer.toBinaryString(result) + ")");
        // 11010110 >>> 2 = 00111111111111111111111111110101
        result = b >>> 2;
        System.out.println("ZERO FILL RIGHT SHIFT: -15 >>> 2 = " + result + " (binary: "
                + Integer.toBinaryString(result) + ")");
        // 11110001 >>> 2 = 00111111111111111111111111111100

        // ZERO FILL RIGHT SHIFT, ASSIGNMENT(>>>=) with negative numbers
        a >>>= 2;
        System.out.println("ZERO FILL RIGHT SHIFT,ASSIGNMENT: -42 >>>= 2 = " + a + " (binary: "
                + Integer.toBinaryString(a) + ")");
        // 11010110 >>>= 2 = 00111111111111111111111111110101
        b >>>= 2;
        System.out.println("ZERO FILL RIGHT SHIFT,ASSIGNMENT: -15 >>>= 2 = " + b + " (binary: "
                + Integer.toBinaryString(b) + ")");
        // 11110001 >>>= 2 = 00111111111111111111111111111100
        a = -42;
        b = -15;

        // LEFT SHIFT(<<) with negative numbers
        result = a << 2;
        System.out.println("LEFT SHIFT: -42 << 2 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // 11010110 << 2 = 01011000
        result = b << 2;
        System.out.println("LEFT SHIFT: -15 << 2 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // 11110001 << 2 = 11000100

        // LEFT SHIFT,ASSIGNMENT (<<=) with negative numbers
        a <<= 2;
        System.out.println("LEFT SHIFT,ASSIGNMENT: -42 <<= 2 = " + a + " (binary: " + Integer.toBinaryString(a) + ")");
        // 11010110 <<= 2 = 01011000
        b <<= 2;
        System.out.println("LEFT SHIFT,ASSIGNMENT: -15 <<= 2 = " + b + " (binary: " + Integer.toBinaryString(b) + ")");
        // 11110001 <<= 2 = 11000100

        // Bitwise operators can be applied only to the integer types: long, int, short, char, and byte.
        // Therefore, it's impossible to apply these operators to 42.5 (double).
        // double c = 42.5;
        // c <<= 2; the error occurs: java: bad operand types for binary operator '<<'

    }
}
