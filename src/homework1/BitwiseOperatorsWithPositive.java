package homework1;

public class BitwiseOperatorsWithPositive {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int result;
        System.out.println(a + " to binary: " + Integer.toBinaryString(a)); // 00101010
        System.out.println(b + " to binary: " + Integer.toBinaryString(b)); // 00001111

        // NOT(~) with positive numbers
        result = ~a;
        System.out.println("NOT: 42 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // ~00101010 = 11111111111111111111111111010101
        result = ~b;
        System.out.println("NOT: 15 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // ~00001111 = 11111111111111111111111111110000

        // AND(&) with positive numbers
        result = a & b;
        System.out.println("AND: 42 & 15 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // 00101010 & 00001111 = 00001010

        // AND,ASSIGNMENT(&=) with positive numbers
        a &= b;
        System.out.println("AND,ASSIGNMENT: 42 &= 15 = " + a + " (binary: "
                + Integer.toBinaryString(a) + ")");
        // 00101010 &= 00001111 = 00001010
        a = 42;

        // OR(|) with positive numbers
        result = a | b;
        System.out.println("OR: 42 | 15 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // 00101010 | 00001111 = 00101111

        // OR,ASSIGNMENT(|=) with positive numbers
        b |= a;
        System.out.println("OR,ASSIGNMENT: 15 |= 42 = " + b + " (binary: " + Integer.toBinaryString(b) + ")");
        // 00101010 |= 00001111 = 00101111
        b = 15;

        // XOR(^) with positive numbers
        result = a ^ b;
        System.out.println("XOR: 42 ^ 15 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // 00101010 ^ 00001111 = 00100101

        // XOR,ASSIGNMENT(^=) with positive numbers
        a ^= b;
        System.out.println("XOR,ASSIGNMENT: 42 ^= 15 = " + a + " (binary: "
                + Integer.toBinaryString(a) + ")");
        // 00101010 ^= 00001111 = 00100101
        a = 42;

        // RIGHT SHIFT (>>) with positive numbers
        // Used shift by 2 positions for both variables to get more representative results
        result = a >> 2;
        System.out.println("RIGHT SHIFT: 42 >> 2 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // 00101010 >> 2 = 00001010
        result = b >> 2;
        System.out.println("RIGHT SHIFT: 15 >> 2 = " + result + " (binary: "
                + Integer.toBinaryString(result) + ")");
        // 00001111 >> 2 = 00000011

        // RIGHT SHIFT,ASSIGNMENT (>>=) with positive numbers
        a >>= 2;
        System.out.println("RIGHT SHIFT,ASSIGNMENT: 42 >>= 2 = " + a + " (binary: "
                + Integer.toBinaryString(a) + ")");
        // 00101010 >>= 2 = 00001010
        b >>= 2;
        System.out.println("RIGHT SHIFT,ASSIGNMENT: 15 >>= 2 = " + b + " (binary: "
                + Integer.toBinaryString(b) + ")");
        // 00001111 >>= 2 = 00000011
        a = 42;
        b = 15;

        // ZERO FILL RIGHT SHIFT(>>>) with positive numbers
        result = a >>> 2;
        System.out.println("ZERO FILL RIGHT SHIFT: 42 >>> 2 = " + result + " (binary: "
                + Integer.toBinaryString(result) + ")");
        // 00101010 >>> 2 = 00001010
        result = b >>> 2;
        System.out.println("ZERO FILL RIGHT SHIFT: 15 >>> 2 = " + result + " (binary: "
                + Integer.toBinaryString(result) + ")");
        // 00001111 >>> 2 = 00000011

        // ZERO FILL RIGHT SHIFT, ASSIGNMENT(>>>=) with positive numbers
        a >>>= 2;
        System.out.println("ZERO FILL RIGHT SHIFT,ASSIGNMENT: 42 >>>= 2 = " + a + " (binary: "
                + Integer.toBinaryString(a) + ")");
        // 00101010 >>>= 2 = 00001010
        b >>>= 2;
        System.out.println("ZERO FILL RIGHT SHIFT,ASSIGNMENT: 15 >>>= 2 = " + b + " (binary: "
                + Integer.toBinaryString(b) + ")");
        // 00001111 >>>= 2 = 00000011
        a = 42;
        b = 15;

        // LEFT SHIFT(<<) with positive numbers
        result = a << 2;
        System.out.println("LEFT SHIFT: 42 << 2 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // 00101010 << 2 = 10101000
        result = b << 2;
        System.out.println("LEFT SHIFT: 15 << 2 = " + result + " (binary: " + Integer.toBinaryString(result) + ")");
        // 00001111 << 2 = 00111100

        // LEFT SHIFT,ASSIGNMENT (<<=) with positive numbers
        a <<= 2;
        System.out.println("LEFT SHIFT,ASSIGNMENT: 42 <<= 15 = " + a + " (binary: " + Integer.toBinaryString(a) + ")");
        // 00101010 <<= 2 = 10101000
        b <<= 2;
        System.out.println("LEFT SHIFT,ASSIGNMENT: 42 <<= 15 = " + b + " (binary: " + Integer.toBinaryString(b) + ")");
        // 00001111 <<= 2 = 00111100

    }
}
