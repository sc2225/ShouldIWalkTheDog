package shouldIwalkthedog;

//processor or client class that desires the behavior from the impl classes
public class Dog {
	private DogWalkFactory obj = null;
	
	public Dog(DogWalkFactory dw) {
	
		//passing in the type of dog factory we want to call
		obj = dw;
		
	}
	
	public void toWalkorNo(String weather) {
		Walkable walk = obj.walkableCreation(weather);
		walk.walk();
		
	}
	
	
	
	

}
