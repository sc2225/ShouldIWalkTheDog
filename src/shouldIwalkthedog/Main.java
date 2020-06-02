package shouldIwalkthedog;

public class Main {

	public static void main(String[] args) {
	
		//Pass in an instance of the factory so that Dog can call it
		DogWalkFactory dwf = new DogWeatherFactory();
		Dog myDog = new Dog(dwf);
		myDog.toWalkorNo("Rain"); 
		
	}

}
