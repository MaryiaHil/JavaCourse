package homework7.solid.sender.api;

import homework7.diagram.customers.Customer;
import homework7.diagram.customers.Order;

public interface ISender {
    boolean send(String meansOfCommunication, Customer customer, Order order, String text);
}
