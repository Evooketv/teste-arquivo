public class Item {
    private int itemId;
    private int itemQuantity;
    private double itemPrice;

    public Item(int itemId, int itemQuantity, double itemPrice) {
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;

    }

    public int getItemId() {
        return itemId;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public double subTotal() {
        return itemQuantity * itemPrice;
    }
}
