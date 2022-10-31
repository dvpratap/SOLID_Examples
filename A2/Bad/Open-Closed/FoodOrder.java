public class FoodOrder {
    private float distance;
    private int itemPrice;
    private int quantity;
    public void setDistance(float dist){
        distance=dist;
    }
    public float getDistance(){
        return distance;
    }
    public void setItemPrice(int price){
        itemPrice=price;
    }
    public int getItemPrice(){
        return itemPrice;
    }
    public void setQuantity(int qty){
        quantity=qty;
    }
    public int getQuantity(){
        return quantity;
    }

    DeliveryFee D1 = new DeliveryFee();
    public float generateTotalBill(){
        int bill = (itemPrice * quantity);
        float deliveryFee = D1.calculateDeliveryFee(distance);
        float totalbill = bill + deliveryFee;
        return totalbill;
    }
}

