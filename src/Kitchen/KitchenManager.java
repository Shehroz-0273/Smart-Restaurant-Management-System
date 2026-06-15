package Kitchen;

import java.util.PriorityQueue;

public class KitchenManager {

    private PriorityQueue<KitchenOrder>
            kitchenQueue;

    public KitchenManager() {

        kitchenQueue =
                new PriorityQueue<>();
    }

    public void addToKitchen(
            KitchenOrder order) {

        kitchenQueue.offer(order);

        System.out.println(
                "\nOrder Added To Kitchen!"
        );
    }

    public void processNextOrder() {

        if(kitchenQueue.isEmpty()) {

            System.out.println(
                    "\nNo Orders In Kitchen!"
            );

            return;
        }

        KitchenOrder nextOrder =
                kitchenQueue.poll();

        System.out.println(
                "\nPreparing Order:"
        );

        System.out.println(nextOrder);
    }

    public void displayPendingOrders() {

        if(kitchenQueue.isEmpty()) {

            System.out.println(
                    "\nNo Pending Orders!"
            );

            return;
        }

        for(KitchenOrder order
                : kitchenQueue) {

            System.out.println(order);

            System.out.println(
                    "\n------------------"
            );
        }
    }
}