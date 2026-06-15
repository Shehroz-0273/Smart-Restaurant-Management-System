package Kitchen;

import Order.order;

public class KitchenOrder
        implements Comparable<KitchenOrder> {

    private order order;
    private int priority;

    public KitchenOrder(order order,
                        int priority) {

        this.order = order;
        this.priority = priority;
    }

    public order getOrder() {
        return order;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(
            KitchenOrder other) {

        return Integer.compare(
                this.priority,
                other.priority
        );
    }

    @Override
    public String toString() {

        return order.toString()
                + "\nPriority: "
                + priority;
    }
}