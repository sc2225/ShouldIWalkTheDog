package shouldIwalkthedog;

public class Main {

	public static void main(String[] args) {
	
		DogWalkFactory dwf = new DogWeatherFactory();
		Dog myDog = new Dog(dwf);
		myDog.toWalkorNo("Rain");
		
	}

}
