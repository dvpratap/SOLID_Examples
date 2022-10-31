public class smallStoreManager implements IManager,ICashier,ICleaner,ISalesMan{
    @Override
    public void cleaning() {
        System.out.println(" Same Person does cleaning ");
    }

    @Override
    public void managing() {
        System.out.println(" Same Person works as manager to manage store ");
    }

    @Override
    public void selling() {
        System.out.println(" Same person Works as Salesman and sells products");
    }
    @Override
    public void billing() {
        System.out.println(" Same Person works as Cashier and does billing");
    }
}
