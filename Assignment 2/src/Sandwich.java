//Code written by Calabangiu Tudor student number 180322435
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sandwich extends FoodName { // carries all the essential information about a sandwich, including some bread
											// and some toppings

	private List<Topping> toppings = new ArrayList<Topping>(); // Creating a list to hold all toppings
	private Bread bread; // Variable to hold bread type
	private List<Filling> fillings = new ArrayList<Filling>(); // Creating a list to hold all fillings

	public Sandwich(Bread bread) // Referencing to the current bread object
	{
		this(null, bread);
	}

	public Sandwich(String name, Bread bread) // Creating the sandwich object
	{
		super(name);
		this.bread = bread;
	}

	public Sandwich(String name, Bread bread, Topping[] topping, Filling[] filling) // Making another sandwich object
																					// but this time
	{ 																				// it takes arrays of toppings and fillings
		this(name, bread); 															// and puts them in the lists created above
		toppings.addAll(Arrays.asList(topping));//I used this one for prebuild sandwiches
		fillings.addAll(Arrays.asList(filling));
	}

	public void addTopping(Topping topping) // Method to add a topping to the list
	{
		toppings.add(topping);
	}

	public List<Topping> getToppings() { // Method to get all toppings from the list
		return toppings;
	}

	public void addFilling(Filling filling) // Method to add a filling to the list above
	{
		fillings.add(filling);
	}

	public List<Filling> getFilling() { // Method to get all fillings from the list
		return fillings;
	}

	public Bread getBread() { // Method to get the bread type
		return bread;
	}

	public double getPrice() { 				// Method to calculate the price of a sandwich
		double price = bread.getPrice(); 	// by initializing a double with the price of the chosen bread
											// and adding to it the price of every single filling and
		for (Topping t : toppings) { 		// topping chosen for the sandwich
			price = price + t.getPrice();
		}

		for (Filling f : fillings) {
			price = price + f.getPrice();
		}

		return price;
	}

}
