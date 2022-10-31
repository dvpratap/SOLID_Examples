public class FoodStore extends storeOperations{
    @Override
    public void getProductPrice(String name) {
        if(name.equals("pasta")){
            itemPrice = 55.60f;
        }
        else if(name.equals("pizza")){
            itemPrice = 70.99f;
        }
        else if(name.equals("indian")){
            itemPrice = 40.99f;
        }
        else{
            itemPrice = 39.99f;
        }
    }

    @Override
    public void takeOrders(String name, int qty) {
        itemName = name;
        quantity = qty;
    }
}
