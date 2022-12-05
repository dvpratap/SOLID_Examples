import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Square is a composite, making up the Composite pattern (contains components)
public class Square extends BoardComponent implements IObserver
{
	private final CopyOnWriteArrayList<BoardComponent> children;
	private BoardComponent parent;
	public Square()
	{
		super();
		children = new CopyOnWriteArrayList<BoardComponent>();
	}

	@Override
	public void Operation()
	{
		ArrayList<BoardComponent> childrenCopy = new ArrayList<BoardComponent>(children);
		for (int i = 0; i < childrenCopy.size(); i++)
		{
			BoardComponent child = childrenCopy.get(i);
			child.Operation();
		}
	}

	@Override
	public void Add(BoardComponent child)
	{
		// I am now this child's parent.
		children.add(child);
		child.SetParent(this);
	}

	@Override
	public void Remove(BoardComponent child)
	{
		children.remove(child);
	}

	@Override
	public void buildingDamage() {
		// for buildings
	}

	@Override
	public void update(Square square) {
			if(this.equals(square)){
				for (Iterator<BoardComponent> itr = children.iterator(); itr.hasNext(); ){
					itr.next().buildingDamage();
				}
			}
	}

}