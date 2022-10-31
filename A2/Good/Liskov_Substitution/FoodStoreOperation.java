public abstract class FoodStoreOperation extends storeOperation {
    protected float itemPrice;
    protected String itemName;
    protected int quantity;
    protected String customerName;
    protected String email;

    @Override
    public float generateBill() {
        getProductPrice(itemName);
        float price = (itemPrice * quantity);
        return ((price * 0.2f)+ price);
    }

    @Override
    public void getCustomerDetails(String name, String mail) {
        customerName = name;
        email = mail;
    }
    public abstract void getProductPrice(String name);
    public abstract void takeOrders(String name, int qty);
}
