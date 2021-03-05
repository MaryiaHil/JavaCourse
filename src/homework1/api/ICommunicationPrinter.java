package homework1.api;

public interface ICommunicationPrinter {

    /**
     * Provides a customized welcome message for the users "Вася" and "Анастасия", and a default message for others.
     * @param name - the name of the user.
     * @return - a string with welcome message.
     */
    String welcome(String name);
}
