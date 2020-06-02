package shouldIwalkthedog;

public class DogWeatherFactory extends DogWalkFactory {
	
	public Walkable walkableCreation(String weather) {
		if (weather.equals("Hot")) {
			return new WalkableHotImpl();
		} else if (weather.equals("Snow")) {
			return new WalkableSnowImpl();
		} else if (weather.equals("Rain")) {
			return new WalkableRainImpl();
		} else {
			return null;
		}
	}

}
