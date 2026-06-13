package Menu;
import java.util.ArrayList;

public class Menu_Category {
    private String categoryName;
    private ArrayList<Menu_Item> items;

    public Menu_Category(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void addItem(Menu_Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("\n" + categoryName + ":");

        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }
}