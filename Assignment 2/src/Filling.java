//Code written by Calabangiu Tudor student number 180322435
public class Filling extends IngredientPrice {//Class which defines every filling type object

	public Filling(String name, double price) {//Method which gives the referenced filling object a name and price property
		super(name, price);
	}

	public String toString() {					//Method which returns a value and says that it is a filling
		return String.format("%s filling", getName());
	}
}
