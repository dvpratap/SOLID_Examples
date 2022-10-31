public abstract class storeOperations {
    protected float itemPrice;
    protected String itemName;
    protected int quantity;
    protected String customerName;
    protected String email;
    public float generateBill() {
        getProductPrice(itemName);
        float bill = (itemPrice * quantity);
        return ((bill * 0.2f)+ bill);
    }
    public void getCustomerDetails(String name, String mail){
        customerName = name;
        email = mail;
    }
    public abstract void getProductPrice(String name);
    public abstract void takeOrders(String name, int qty);
}
