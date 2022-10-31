public class Main {
    public static void main(String[] args) {
        try{
            smallStoreManager storeManager = new smallStoreManager();
            storeManager.managing();
            storeManager.cleaning();
            storeManager.billing();
            ISalesMan SalesMan = new SalesMan();
            SalesMan.selling();
            ICashier Cashier = new Cashier();
            Cashier.billing();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}