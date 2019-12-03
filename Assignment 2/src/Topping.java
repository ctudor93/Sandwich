//Code written by Calabangiu Tudor student number 180322435
public class Topping extends IngredientPrice {	//Class which defines every topping type object

	public Topping(String name, double price) {//Method which gives the referenced topping a name and price property
		super(name, price);
	}

	public String toString() {//ethod which returns a value and says that it is a topping
		return String.format("%s topping", getName());
	}

}
