// Building is the leaf node for the composite pattern, Square's can have MULTIPLE Buildings
// Buildings cannot have children.
public class Building extends BoardComponent implements IObserver
{
	private int buildingHealth;
	public Building()
	{
		super();
		buildingHealth = 2;
	}

	@Override
	public void Operation()
	{

		// Buildings just stand there, they don't do anything.
	}

	@Override
	public void Add(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	@Override
	public void Remove(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	@Override
	public void update() {
		buildingHealth-=1;
		if(0 == buildingHealth){
			System.out.println("Building Health 0, hence removed,");
			parent.Remove(this);
			int buildingCount = GameBoard.Instance().GetBuildingCount();
			GameBoard.Instance().DecrementBuildingCount();
			System.out.println("BuildingCount: "+buildingCount);
		}
	}
}
