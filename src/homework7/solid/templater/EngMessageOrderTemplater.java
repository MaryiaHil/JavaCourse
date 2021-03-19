package homework7.solid.templater;

import homework7.diagram.customers.Customer;
import homework7.diagram.customers.Order;
import homework7.solid.templater.api.IMessageOrderTemplater;

public class EngMessageOrderTemplater implements IMessageOrderTemplater {
    @Override
    public String getText(Customer customer, Order order) {
        StringBuilder builder = new StringBuilder();
        builder.append("The order has been created ").append(order.getOrderNo());
        builder.append("There are order items: ");
        for (Order.OrderItem orderItem : order.getOrderItems()) {
            builder.append(orderItem.getQuantity())
                    .append(": ")
                    .append(orderItem.getItemPrice())
                    .append(" = ")
                    .append(orderItem.getQuantity() * orderItem.getItemPrice());
        }
        builder.append("Total: ")
                .append(order.getOrderItems().stream().mapToDouble(Order.OrderItem::getItemPrice).sum());
        builder.append("The order was created by " + customer.getName())
                .append(": ")
                .append(customer.getPhone());

        return builder.toString();
    }
}
