package homework7.solid.sender;

import homework7.diagram.customers.Customer;
import homework7.diagram.customers.Order;
import homework7.solid.sender.api.ISender;

public class EmailSender implements ISender {
    @Override
    public boolean send(String meansOfCommunication, Customer customer, Order order, String text) {
        System.out.println("Отправляем электронное сообщение " + meansOfCommunication);
        System.out.println(text);
        return true;
    }
}
