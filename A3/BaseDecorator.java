public abstract class BaseDecorator extends Square{
    private Square tempSquare;
    public BaseDecorator(Square tSquare){
        tSquare = new Square();
    }
}
