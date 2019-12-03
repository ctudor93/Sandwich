//Code written by Calabangiu Tudor student number 180322435
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IngredientList {// Class to hold all ingredients and their price

	private Map<String, Topping> toppings; //Creating a map for topping types and prices

	public Map<String, Topping> getToppings() {//Method to get all the toppings as a list
		if (toppings == null) {	//true as long as there are no values in toppings
			List<Topping> toppingList = new ArrayList<Topping>();//Creating a list to hold all the toppings
			toppingList.add(new Topping("Chilli", 0.5));//Topping types and their price
			toppingList.add(new Topping("Onion", 0.7));
			toppingList.add(new Topping("Mustard", 0.5));
			toppingList.add(new Topping("Mayo", 0.7));
			toppingList.add(new Topping("Harissa", 0.8));
			toppingList.add(new Topping("Ketchup", 0.8));
			toppingList.add(new Topping("Barbecue", 0.6));
			toppings = nameToObjectMap(toppingList);	//calling a method to put the list into a map
		}

		return toppings;//Returns either all of the above or whatever was in it before
	}

	private Map<String, Filling> fillings;//Creating a map for filling types and prices

	public Map<String, Filling> getFillings() {//Method to get all the fillings as a list
		if (fillings == null) {//true as long as there are no values in fillings
			List<Filling> fillingList = new ArrayList<Filling>();//Creating a list to hold all the fillings
			fillingList.add(new Filling("Lettuce", 0.5));//Filling types and their price
			fillingList.add(new Filling("Pepperoni", 0.5));
			fillingList.add(new Filling("Tomatoes", 0.5));
			fillingList.add(new Filling("Ham", 0.6));
			fillingList.add(new Filling("Salami", 0.7));
			fillingList.add(new Filling("Olives", 0.8));
			fillingList.add(new Filling("Pickles", 0.5));
			fillingList.add(new Filling("Cheese", 0.7));
			fillings = nameToObjectMap(fillingList);//calling a method to put the list into a map
		}

		return fillings;//Returns either all of the above or whatever was in it before
	}

	private Map<String, Bread> bread;//Creating a map for bread types and prices

	public Map<String, Bread> getBread() {//Method to get all the breads as a list
		if (bread == null) {//true as long as there are no values in bread
			List<Bread> breadList = new ArrayList<Bread>();
			breadList.add(new Bread("Italian", 1.0));//Bread types and their price
			breadList.add(new Bread("Multigrain", 1.3));
			breadList.add(new Bread("Toast", 1.4));
			breadList.add(new Bread("Honey_Oat", 1.5));
			breadList.add(new Bread("Roasted_Garlic", 1.6));
			breadList.add(new Bread("Flatbread", 1.7));
			bread = nameToObjectMap(breadList);//calling a method to put the list into a map

		}
		return bread;//Returns either all of the above or whatever was in it before
	}

	protected static <P> Map<String, P> nameToObjectMap(List<P> list) {//Method which converts a list into a map
		Map<String, P> map = new HashMap<String, P>();

		for (P p : list) {//Takes every element of the list and puts in in the map
			map.put(((FoodName) p).getName(), p);
		}
		return map;//returns the map
	}

	public static void main(String[] args) {
		IngredientList p = new IngredientList(); //Creating an object to test the class
		System.out.println(p.getToppings());//Checking if it prints toppings properly
		System.out.println(p.getFillings());//Checking if it prints fillings properly
		System.out.println(p.getBread());//Checking if it prints breads properly
	}
}
