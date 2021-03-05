package homework1;

import homework1.api.ICommunicationPrinter;

import java.util.Scanner;

public class ConditionalOperatorsMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // create an object of the class Scanner
        System.out.print("Input name: ");
        String name;

        try {
            name = in.nextLine(); // get the input and assign it to the variable name
        } finally {
            in.close();
        }

        ICommunicationPrinter communicator1 = new IfCommunicator();
        ICommunicationPrinter communicator2 = new IfElseCommunicator();
        ICommunicationPrinter communicator3 = new SwitchCommunicator();

        System.out.println(communicator1.welcome(name));
        System.out.println(communicator2.welcome(name));
        System.out.println(communicator3.welcome(name));
    }
}
