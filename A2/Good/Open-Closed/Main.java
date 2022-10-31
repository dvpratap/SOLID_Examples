public class Main {
    public static void main(String[] args) {
        FoodOrder order1 = new FoodOrder();
        order1.setDistance(5.54f);
        order1.setItemPrice(15);
        order1.setQuantity(4);
        float totalBill = order1.generateTotalBill();
        System.out.println(" Total bill with DeliveryFee for FoodOrder: "+totalBill);

        CourierService c1 = new CourierService();
        c1.getPackageDimension(25.6f, 15.5f,8.5f);
        c1.setWeight(19.5f);
        float courierFee = c1.calculateDeliveryFee(50);
        System.out.println(" Delivery Fee for Courier :" + courierFee);
    }
}