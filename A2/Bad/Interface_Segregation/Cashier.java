public class Cashier implements Ijobs{
    @Override
    public void billing() {
        System.out.println(" Handles Cash/ credit card payments and provides bill receipt");
    }

    @Override
    public void managing() {
        throw new RuntimeException(" Managing is not part of Cashier job");
    }

    @Override
    public void selling() {
        throw new RuntimeException(" Selling product is not part of cashier job");
    }

    @Override
    public void cleaning() {
        throw new RuntimeException(" Cleaning is not part of Cashier job");
    }
}
