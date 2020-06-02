package shouldIwalkthedog;

public abstract class DogWalkFactory {
	
	public DogWalkFactory(){}
	
	public abstract Walkable walkableCreation(String weather);
}
