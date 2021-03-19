package homework7.solid;

import homework7.diagram.customers.Customer;
import homework7.diagram.customers.Order;
import homework7.solid.pattern.MediatorMessageSender;

public class SolidMain3 {
    public static void main(String[] args) {
        Order order = new Order("1");

        order.addItem(10,5);
        order.addItem(11,4);
        order.addItem(110,15);

        Customer customer = new Customer("Вася");
        customer.setPhone("+3750000000000");

        MediatorMessageSender mediator = new MediatorMessageSender();

        boolean sendResult = mediator.send(customer, order);

        if(sendResult) {
            System.out.println("Успешно отправлено.");
        } else {
            System.out.println("Что-то пошло не так.");
        }
    }


}
