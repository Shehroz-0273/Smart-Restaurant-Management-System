package Order;

public class order {

    private int orderId;
    private String itemName;
    private String flavour;
    private String size;
    private double price;

    public order(int orderId,
                 String itemName,
                 String flavour,
                 String size,
                 double price) {

        this.orderId = orderId;
        this.itemName = itemName;
        this.flavour = flavour;
        this.size = size;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getFlavour() {
        return flavour;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {

        return "\nOrder ID : " + orderId +
                "\nItem     : " + itemName +
                "\nFlavour  : " + flavour +
                "\nSize     : " + size +
                "\nPrice    : Rs." + price;
    }
}