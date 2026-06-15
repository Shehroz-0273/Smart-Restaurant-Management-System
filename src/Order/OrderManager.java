package Order;
import java.util.HashMap;

public class OrderManager {

    private HashMap<Integer, order> orders;

    private int nextOrderId;

    public OrderManager() {

        orders = new HashMap<>();

        nextOrderId = 1001;
    }

    public int generateOrderId() {

        return nextOrderId++;
    }

    public void addOrder(order order) {

        orders.put(
                order.getOrderId(),
                order
        );

        System.out.println(
                "\nOrder Stored Successfully!"
        );
    }

    public order searchOrder(
            int orderId) {

        return orders.get(orderId);
    }

    public void displayAllOrders() {

        if(orders.isEmpty()) {

            System.out.println(
                    "\nNo Orders Found!"
            );

            return;
        }

        for(order order :
                orders.values()) {

            System.out.println(order);

            System.out.println(
                    "\n--------------------"
            );
        }
    }

    public void removeOrder(
            int orderId) {

        if(orders.remove(orderId)
                != null) {

            System.out.println(
                    "\nOrder Removed!"
            );
        }
        else {

            System.out.println(
                    "\nOrder Not Found!"
            );
        }
    }
}
