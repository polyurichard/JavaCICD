public class ShoppingCart {
    private int itemsCount = 0;
    private double totalAmount = 0.0;

    public void addItem(int quantity, double price) {
        itemsCount += quantity;
        totalAmount += quantity * price;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}