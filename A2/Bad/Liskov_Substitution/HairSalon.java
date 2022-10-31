public class HairSalon extends storeOperations{
    @Override
    public void getProductPrice(String pName) {
        throw new RuntimeException(" Its a Salon not a SuperStore");
    }

    @Override
    public void takeOrders(String name, int qty) {
        throw new RuntimeException( " Not a restaurant, to take orders");
    }
}
