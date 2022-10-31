public abstract class storeOperations {
    protected String storeType = "Food";
    protected float itemPrice;
    protected String itemName;
    protected int quantity;
    protected String customerName;
    protected String email;
    public float generateBill() {
        float totalbill=0.00f;
        if(storeType.equals("Food")) {
            getProductPrice(itemName);
            float bill = (itemPrice * quantity);
            totalbill = ((bill * 0.2f) + bill);
        }
        return totalbill;
    }
    public void getCustomerDetails(String name, String mail){
        customerName = name;
        email = mail;
    }
    public abstract void getProductPrice(String name);
    public abstract void takeOrders(String name, int qty);
}
