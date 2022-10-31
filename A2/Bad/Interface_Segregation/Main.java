public class Main {
    public static void main(String[] args) {
        try{
            Ijobs storeManager = new smallStoreManager();
            storeManager.managing();
            storeManager.cleaning();
            storeManager.billing();
            Ijobs SalesMan = new SalesMan();
            SalesMan.selling();
            Ijobs Cashier = new Cashier();
            Cashier.billing();
            Cashier.cleaning();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}