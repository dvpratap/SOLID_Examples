public class Main {
    public static void main(String[] args) {
        HairSalon h1 = new HairSalon();
        h1.getCustomerDetails("dev","dev@dal.ca");
        float bill = h1.generateBill();
        System.out.println(" Bill from Salon: "+ bill);
        FoodStore f1 = new FoodStore();
        f1.getCustomerDetails("Dev","dev@dal.ca");
        f1.takeOrders("pizza",2);
        bill = f1.generateBill();
        System.out.println(" Bill from Restaurant: "+ bill);
    }
}