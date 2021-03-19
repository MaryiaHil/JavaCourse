package homework7.solid.templater.api;

import homework7.diagram.customers.Customer;
import homework7.diagram.customers.Order;

public interface IMessageOrderTemplater {
    String getText(Customer customer, Order order);
}
