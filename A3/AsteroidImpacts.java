public class AsteroidImpacts extends Subject{
    private static Subject uniqueInstance = null;

    private AsteroidImpacts(){

    }

    public static Subject Instance(){
        if(null == uniqueInstance){
            uniqueInstance = new AsteroidImpacts();
        }
        return uniqueInstance;
    }

}