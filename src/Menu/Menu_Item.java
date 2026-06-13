package Menu;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu_Item {

    private String itemName;

    private ArrayList<String> flavours;

    private HashMap<String, Double> sizesAndPrices;

    public Menu_Item(String itemName) {

        this.itemName = itemName;
        this.flavours = new ArrayList<>();
        this.sizesAndPrices = new HashMap<>();
    }

    public void addFlavour(String flavour) {
        flavours.add(flavour);
    }

    public void addSize(String size, double price) {
        sizesAndPrices.put(size, price);
    }

    public String getItemName() {
        return itemName;
    }

    public ArrayList<String> getFlavours() {
        return flavours;
    }

    public HashMap<String, Double> getSizesAndPrices() {
        return sizesAndPrices;
    }
}