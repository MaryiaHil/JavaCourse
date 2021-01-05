package homework1;

import java.util.Scanner;

public class ConditionalOperators3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        in.close();
        switch (name) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я так долго тебя ждала.");
                break;
            case "Анастасия":
                System.out.print("Я так долго тебя ждала.");
                break;
            default:
                System.out.print("Добрый день, а Вы кто?");
        }


    }
}
