import javafx.scene.Parent;

public class Shield extends BaseDecorator implements IObserver{
    private int shieldHealth;
    private Square square;
    public Shield(Square newSquare){
        super(newSquare);
        square = newSquare;
        shieldHealth =2;
        System.out.println(" this square has shield with health: "+ shieldHealth);
    }

    @Override
    public void Operation()
    {
        //Do nothing
    }

    @Override
    public void update() {
        shieldHealth-=1;
        if(0 == shieldHealth) {
            System.out.println("Shield health  0, hence removed");
            super.Remove(this);
            super.Add(square);
        }
    }
}
