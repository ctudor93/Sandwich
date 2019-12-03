//Code written by Calabangiu Tudor student number 180322435
public class IngredientPrice extends FoodName {// Class to calculate prices

	protected double price;// Variable which stores the price

	public IngredientPrice(String name, double price) {// Method to make sure the price references to the current object
		super(name);
		this.price = price;
	}

	public double getPrice() {//Method which returns the price when called
		return price;
	}

}
