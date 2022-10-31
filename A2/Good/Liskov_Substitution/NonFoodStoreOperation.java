public abstract class NonFoodStoreOperation extends storeOperation{
    protected float itemPrice;
    protected String itemName;
    protected int quantity;
    protected String customerName;
    protected String email;

    @Override
    public float generateBill() {
        float charges = 35.99f;
        float tip = charges * 0.15f;
        return (charges + tip);
    }

    @Override
    public void getCustomerDetails(String name, String mail) {
        customerName = name;
        email = mail;
    }

}
