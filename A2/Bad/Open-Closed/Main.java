public class Main {
    public static void main(String[] args) {
        FoodOrder order1 = new FoodOrder();
        order1.setDistance(5.54f);
        order1.setItemPrice(15);
        order1.setQuantity(4);
        float totalBill = order1.generateTotalBill();
        System.out.println(" Total bill with DeliveryFee: "+totalBill);
    }
}