public class SalesMan implements Ijobs{
    @Override
    public void selling() {
        System.out.println(" Sells products and provides details about relevant products to customers");
    }

    @Override
    public void billing() {
        throw new RuntimeException(" Billing is not part of Salesman JOb");
    }

    @Override
    public void cleaning() {
        throw new RuntimeException(" Cleaning is not part of Salesman job");
    }

    @Override
    public void managing() {
        throw new RuntimeException(" Managing store is not part of SalesMan Job");
    }
}
