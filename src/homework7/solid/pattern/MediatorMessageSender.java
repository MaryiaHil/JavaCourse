package homework7.solid.pattern;

import homework7.diagram.customers.Customer;
import homework7.diagram.customers.Order;
import homework7.solid.sender.EmailSender;
import homework7.solid.sender.SmsSender;
import homework7.solid.sender.api.ISender;
import homework7.solid.templater.RusMessageOrderTemplater;
import homework7.solid.templater.api.IMessageOrderTemplater;

public class MediatorMessageSender {
    public boolean send(Customer customer, Order order) {
        boolean managerSleep = true;
        boolean result;

        IMessageOrderTemplater templater = new RusMessageOrderTemplater();
        ISender sender1 = new EmailSender();
        ISender sender2 = new SmsSender();
        String text = templater.getText(customer, order);

        if (!managerSleep) {
            result = sender1.send("transistor@mail.ru", customer, order, text);
        } else {
            result = sender2.send("2346789999", customer, order, text);
        }
        return result;
    }

}
