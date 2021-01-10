package taskcode;
/*
Вводится целое число, обозначающее код символа по таблице ASCII.
Определить, это код английской буквы или какой-либо иной символ.
 */

import java.util.Scanner;

public class LetterOrSymbol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите любое число в диапазоне от 32 до 126: ");
            int a = in.nextInt();
            isLetterOrSymbol(a);
            System.out.println("--------------------------------------");
        }

    }

    public static void isLetterOrSymbol(int x) {
        if (x > 64 && x < 123) {
            char letter = (char) x;
            System.out.println("Это код английской буквы: " + letter);
        } else {
            char symbol = (char) x;
            System.out.println("Это код символа: " + symbol);
        }
    }
}
