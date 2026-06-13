package Menu;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class MenuService {

    private MenuTree menuTree;
    private Scanner input;

    public MenuService(MenuTree menuTree) {

        this.menuTree = menuTree;
        this.input = new Scanner(System.in);
    }

    public void placeOrder() {

        TreeNode category = selectCategory();

        if(category == null)
            return;

        TreeNode itemNode = selectItem(category);

        if(itemNode == null)
            return;

        Menu_Item item = itemNode.getMenuItem();

        String flavour = selectFlavour(item);

        String size = selectSize(item);

        double price =
                item.getSizesAndPrices().get(size);

        System.out.println("\n========================");
        System.out.println("ORDER SUMMARY");
        System.out.println("========================");

        System.out.println("Item     : " +
                item.getItemName());

        System.out.println("Flavour  : " +
                flavour);

        System.out.println("Size     : " +
                size);

        System.out.println("Price    : Rs." +
                price);

        System.out.println("========================");
    }

    private TreeNode selectCategory() {

        ArrayList<TreeNode> categories =
                menuTree.getRoot().getChildren();

        System.out.println("\n===== CATEGORIES =====");

        for(int i = 0 ; i < categories.size() ; i++) {

            System.out.println(
                    (i + 1) + ". " +
                            categories.get(i).getNodeName()
            );
        }

        System.out.print("\nSelect Category: ");

        int choice = input.nextInt();

        if(choice < 1 ||
                choice > categories.size()) {

            System.out.println(
                    "Invalid Category!"
            );

            return null;
        }

        return categories.get(choice - 1);
    }

    private TreeNode selectItem(
            TreeNode category) {

        ArrayList<TreeNode> items =
                category.getChildren();

        System.out.println(
                "\n===== " +
                        category.getNodeName() +
                        " ====="
        );

        for(int i = 0 ; i < items.size() ; i++) {

            System.out.println(
                    (i + 1) + ". " +
                            items.get(i).getNodeName()
            );
        }

        System.out.print("\nSelect Item: ");

        int choice = input.nextInt();

        if(choice < 1 ||
                choice > items.size()) {

            System.out.println(
                    "Invalid Item!"
            );

            return null;
        }

        return items.get(choice - 1);
    }

    private String selectFlavour(
            Menu_Item item) {

        ArrayList<String> flavours =
                item.getFlavours();

        if(flavours.isEmpty()) {

            return "Default";
        }

        System.out.println(
                "\n===== FLAVOURS ====="
        );

        for(int i = 0 ;
            i < flavours.size() ;
            i++) {

            System.out.println(
                    (i + 1) + ". " +
                            flavours.get(i)
            );
        }

        System.out.print(
                "\nSelect Flavour: "
        );

        int choice =
                input.nextInt();

        return flavours.get(choice - 1);
    }

    private String selectSize(
            Menu_Item item) {

        LinkedHashMap<String, Double>
                sizes =
                new LinkedHashMap<>(
                        item.getSizesAndPrices()
                );

        ArrayList<String> sizeList =
                new ArrayList<>(
                        sizes.keySet()
                );

        System.out.println(
                "\n===== SIZES ====="
        );

        for(int i = 0 ;
            i < sizeList.size() ;
            i++) {

            String size =
                    sizeList.get(i);

            System.out.println(
                    (i + 1)
                            + ". "
                            + size
                            + " - Rs."
                            + sizes.get(size)
            );
        }

        System.out.print(
                "\nSelect Size: "
        );

        int choice =
                input.nextInt();

        return sizeList.get(choice - 1);
    }
}