//Code written by Calabangiu Tudor student number 180322435
public class Bread extends IngredientPrice { // Class which defines every bread object

	public Bread(String name, double price) { //Method which gives a name and price property to the referenced current bread
		super(name, price);
		this.price = price;
	}

	public String toString() {				//ethod which returns a value and says that it is a bread type
		return String.format("%s bread", getName());
	}

}
