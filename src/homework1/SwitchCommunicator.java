package homework1;

import homework1.api.ICommunicationPrinter;

public class SwitchCommunicator implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        switch (name) {
            case "Вася":
                return "Привет! \nЯ тебя так долго ждала.";
            case "Анастасия":
                return "Я тебя так долго ждала.";
            default:
                return "Добрый день, а Вы кто?";
        }
    }
}
