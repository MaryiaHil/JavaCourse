package homework7.solid;

import homework7.diagram.customers.Customer;
import homework7.diagram.customers.Order;

public class SolidMain1 {
    public static void main(String[] args) {
        Order order = new Order("1");

        order.addItem(10,5);
        order.addItem(11,4);
        order.addItem(110,15);

        Customer customer = new Customer("Вася");
        customer.setPhone("+3750000000000");

        sendSms("9999999999", customer, order);
        System.out.println("________________");
        sendSms("7986466346", customer, order);
        System.out.println("________________");
        sendSms("1113467889", customer, order);
    }

    /**
     * Отправить смс с содержанием заказа
     * @param number номер на который отправляем смс
     * @param customer инфо о заказчике
     * @param order инфо о заказе
     * @return подтверждение отправления
     */
    public static boolean sendSms(String number, Customer customer, Order order){
        System.out.println("Отправляем смс на номер " + number + ". Сформирован заказ " + order.getOrderNo());
        System.out.println("В заказе есть позиции: ");
        for (Order.OrderItem orderItem : order.getOrderItems()) {
            System.out.println(orderItem.getQuantity() + ": " +
                    orderItem.getItemPrice() + " = " + (orderItem.getQuantity() * orderItem.getItemPrice()));
        }
        System.out.println("Сумма заказа: " +order.getOrderItems().stream().mapToDouble(Order.OrderItem::getItemPrice).sum());
        System.out.println("Заказ сформировал " + customer.getName() + ": " + customer.getPhone());
        return true;
    }
}
