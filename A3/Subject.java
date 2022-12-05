import java.util.*;

public abstract class Subject {
    private List<IObserver> observers;
    //private Map<String, Object> keyValuePairs;

    public Subject(){
        observers = new ArrayList<IObserver>();
        //keyValuePairs = new HashMap<>();
    }
    public void attach(IObserver observer){
        observers.add(observer);
    }
    public void detach(IObserver observer){
        observers.remove(observer);
    }
    public void  notifyObservers(){
        for(Iterator<IObserver> itr = observers.iterator(); itr.hasNext();)
        {//ListIterator<IObserver> itr = observers.listIterator();
            itr.next().update();
        }
    }
}
