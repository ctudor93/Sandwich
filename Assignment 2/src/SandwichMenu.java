//Code written by Calabangiu Tudor student number 180322435
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SandwichMenu extends IngredientList {// A class which allows the user to choose from premade sandwiches
	private Map<String, Sandwich> named;// Map to store the sandwich and it's ingredients

	public Map<String, Sandwich> getNamedSandwich() {// Method to retrieve a prebuilt sandwich
		if (named == null) {// executes as long as there is nothing in named;
			Map<String, Bread> b = getBread();// Creating objects for bread, filling and topping
			Map<String, Topping> t = getToppings();
			Map<String, Filling> f = getFillings();

			List<Sandwich> sandwichList = new ArrayList<Sandwich>();// making a list to hold all the details
			sandwichList.add(// making a new sandwich of the type string, bread, topping[] and filling[] for
								// 3 times
					new Sandwich("Italian BTL", b.get("Italian"), new Topping[] { t.get("Chilli"), t.get("Ketchup") },
							new Filling[] { f.get("Salami"), f.get("Pepperoni") }));

			sandwichList
					.add(new Sandwich("Melt", b.get("Italian"), new Topping[] {}, new Filling[] { f.get("Cheese") }));
			named = nameToObjectMap(sandwichList);

			sandwichList.add(
					new Sandwich("Vegan", b.get("Roasted_Garlic"), new Topping[] { t.get("Onion"), t.get("Harissa") },
							new Filling[] { f.get("Cheese"), f.get("Lettuce"), f.get("Tomatoes"), f.get("Olives") }));
			named = nameToObjectMap(sandwichList);// Method to put the list into the map
		}
		return named;// returns the map
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Sandwich> choices = new SandwichMenu().getNamedSandwich();// Object to test class out
		System.out.println("Choose one of the following sandwiches");
		System.out.printf("Italian BTL\nMelt\nVegan\n");// the 3 prebuild sandwiches

		String sandwich = scanner.nextLine();
		Sandwich decided = choices.get(sandwich);// Takes user input and fills a sandwich object with all the
													// ingredients associated with the input
		System.out.printf("You have chosen %s which contains %s and %s ", decided.getName(), decided.getToppings(), // Telling
																													// the
																													// user
																													// what
																													// he
																													// chose
				decided.getFilling());
		System.out.printf("\nIt costs %s without VAT and %s with VAT", decided.getPrice(), // Giving out the price
				decided.getFullPrice(decided.getPrice()));
		scanner.close();
	}
}
