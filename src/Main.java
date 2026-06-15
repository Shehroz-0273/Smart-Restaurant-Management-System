import Menu.MenuData;
import Menu.MenuService;
import Menu.MenuTree;

import Order.order;
import Order.OrderManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MenuTree menuTree =
                MenuData.createMenu();

        MenuService menuService =
                new MenuService(menuTree);

        OrderManager orderManager =
                new OrderManager();

        Scanner input =
                new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n========================");
            System.out.println("       DINEFLOW");
            System.out.println("========================");
            System.out.println("1. Place Order");
            System.out.println("2. Search Order");
            System.out.println("3. View All Orders");
            System.out.println("4. Cancel Order");
            System.out.println("5. Exit");

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

                    System.out.println(
                            "\nThank You For Using DineFlow!"
                    );

                    break;

                default:

                    System.out.println(
                            "\nInvalid Choice!"
                    );
            }

        } while(choice != 5);

        input.close();
    }
}