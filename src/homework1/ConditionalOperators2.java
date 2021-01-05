package homework1;

import java.util.Scanner;

public class ConditionalOperators2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        in.close();
        if (name.equals("Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждала.");
        } else if (name.equals("Анастасия")) {
            System.out.print("Я тебя так долго ждала.");

        } else {
            System.out.print("Добрый день, а Вы кто?");
        }


    }
}
