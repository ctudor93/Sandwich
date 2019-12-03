//Code written by Calabangiu Tudor student number 180322435
import java.util.Scanner;

public class SandwichChoice {//Class which lets you chose your own ingredients

	public static void main(String[] args) {

		IngredientList p = new IngredientList();//Making an object of the IngredientList type
		Scanner scanner = new Scanner(System.in);//New scanner

		System.out.println("Choose bread type");
		for (Bread b : p.getBread().values()) {//Printing all bread types and their values from the IngredientList class
			System.out.println(b.getName() + " " + b.getPrice());
		}
		

		Bread chosenBread = p.getBread().get(scanner.next());//Setting the chosen bread for the sandwich
		System.out.printf("You chose %s\n", chosenBread.getName());//Letting the user know what he chose
		Sandwich s = new Sandwich(chosenBread);//Creating a sandwich object 
	
		System.out.println("Choose a topping or enter stop");
		for (Topping t : p.getToppings().values()) {//Printing all toppings and their values from the IngredientList class
			System.out.println(t.getName() + " " + t.getPrice());
		}

		while (scanner.hasNext()) {				//Method which allows the user to choose as many toppings as he likes and to
			String next = scanner.next();		//enter stop to move on
			if (next.equals("stop"))
				break;
			else//as long as the next input is not stop, every value is found in the map in IngredientList and added to the
				s.addTopping(p.getToppings().get(next));//sandwich list
			System.out.println("You chose " + s.getToppings());

		}
		System.out.println("Your toppings are " + s.getToppings());//Letting the user know what he chose

		System.out.println("Choose a filling or enter stop");
		for (Filling f : p.getFillings().values()) {//Same as above but this time for fillings
			System.out.println(f.getName() + " " + f.getPrice());
		}
		
		while (scanner.hasNext()) {
			String next = scanner.next();
			if (next.equals("stop"))
				break;
			else
				s.addFilling(p.getFillings().get(next));
			System.out.println("You chose " + s.getFilling());

		}
		System.out.println("\nYour fillings are \n");

		for (Filling f : s.getFilling()) {
			System.out.println(f.getName() + " " + f.getPrice());
		}

		System.out.println("\nYour toppings are \n");//Breaking the final sandwich down into ingredients and prices
		for (Topping t : s.getToppings()) {
			System.out.println(t.getName() + " " + t.getPrice());
		}

		System.out.println("\nYour bread type is " + chosenBread);//Showing chosen bread 

		System.out.println("\nPrice after VAT is " + s.getFullPrice(s.getPrice()) + " pounds and price before VAT is "
				+ s.getPrice() + " pounds");//Giving the final price with and without VAT
		scanner.close();
	}
}
