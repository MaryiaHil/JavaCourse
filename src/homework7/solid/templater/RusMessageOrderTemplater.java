package homework7.solid.templater;

import homework7.diagram.customers.Customer;
import homework7.diagram.customers.Order;
import homework7.solid.templater.api.IMessageOrderTemplater;

public class RusMessageOrderTemplater implements IMessageOrderTemplater {
    @Override
    public String getText(Customer customer, Order order) {
        StringBuilder builder = new StringBuilder();
        builder.append("Сформирован заказ ").append(order.getOrderNo());
        builder.append("В заказе есть позиции: ");
        for (Order.OrderItem orderItem : order.getOrderItems()) {
            builder.append(orderItem.getQuantity())
                    .append(": ")
                    .append(orderItem.getItemPrice())
                    .append(" = ")
                    .append(orderItem.getQuantity() * orderItem.getItemPrice());
        }
        builder.append("Сумма заказа: ")
                .append(order.getOrderItems().stream().mapToDouble(Order.OrderItem::getItemPrice).sum());
        builder.append("Заказ сформировал " + customer.getName())
                .append(": ")
                .append(customer.getPhone());

        return builder.toString();
    }
}
