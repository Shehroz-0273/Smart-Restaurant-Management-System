import Menu.MenuData;
import Menu.MenuService;
import Menu.MenuTree;

import Order.order;
import Order.OrderManager;

import Kitchen.KitchenManager;
import Kitchen.KitchenOrder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MenuTree menuTree =
                MenuData.createMenu();

        MenuService menuService =
                new MenuService(menuTree);

        OrderManager orderManager =
                new OrderManager();

        KitchenManager kitchenManager =
                new KitchenManager();

        Scanner input =
                new Scanner(System.in);

        int choice;

        do {
            System.out.println("==================");
            System.out.println("     DineFlow");
            System.out.println("==================");
            System.out.println("1. Place Order");
            System.out.println("2. Search Order");
            System.out.println("3. View All Orders");
            System.out.println("4. Cancel Order");
            System.out.println("5. Process Next Kitchen Order");
            System.out.println("6. View Pending Kitchen Orders");
            System.out.println("7. Exit");

            System.out.print("\nEnter Choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:

                    order tempOrder =
                            menuService.placeOrder();

                    if(tempOrder == null) {
                        break;
                    }

                    int orderId =
                            orderManager.generateOrderId();

                    order finalOrder =
                            new order(
                                    orderId,
                                    tempOrder.getItemName(),
                                    tempOrder.getFlavour(),
                                    tempOrder.getSize(),
                                    tempOrder.getPrice()
                            );

                    orderManager.addOrder(finalOrder);

                    System.out.println(
                            "\nSelect Priority:"
                    );

                    System.out.println(
                            "1. VIP"
                    );

                    System.out.println(
                            "2. Express"
                    );

                    System.out.println(
                            "3. Normal"
                    );

                    System.out.print(
                            "Enter Priority: "
                    );

                    int priority =
                            input.nextInt();

                    KitchenOrder kitchenOrder =
                            new KitchenOrder(
                                    finalOrder,
                                    priority
                            );

                    kitchenManager.addToKitchen(
                            kitchenOrder
                    );

                    System.out.println(
                            "\n===== ORDER SUMMARY ====="
                    );

                    System.out.println(finalOrder);

                    break;

                case 2:

                    System.out.print(
                            "\nEnter Order ID: "
                    );

                    int searchId =
                            input.nextInt();

                    order foundOrder =
                            orderManager.searchOrder(searchId);

                    if(foundOrder != null) {

                        System.out.println(
                                "\nOrder Found:"
                        );

                        System.out.println(foundOrder);
                    }
                    else {

                        System.out.println(
                                "\nOrder Not Found!"
                        );
                    }

                    break;

                case 3:

                    orderManager.displayAllOrders();

                    break;

                case 4:

                    System.out.print(
                            "\nEnter Order ID To Cancel: "
                    );

                    int removeId =
                            input.nextInt();

                    orderManager.removeOrder(removeId);

                    break;

                case 5:

                    kitchenManager.processNextOrder();

                    break;

                case 6:

                    kitchenManager.displayPendingOrders();

                    break;

                case 7:

                    System.out.println(
                            "\nThank You For Using DineFlow!"
                    );

                    break;

                default:

                    System.out.println(
                            "\nInvalid Choice!"
                    );
            }

        } while(choice != 7);

        input.close();
    }
}