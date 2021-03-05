package homework1;

import homework1.api.ICommunicationPrinter;

public class IfElseCommunicator implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        if (name.equals("Вася")) {
            return "Привет! \nЯ тебя так долго ждала.";
        } else if (name.equals("Анастасия")) {
            return "Я тебя так долго ждала.";
        } else {
            return "Добрый день, а Вы кто?";
        }
    }
}
