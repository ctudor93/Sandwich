//Code written by Calabangiu Tudor student number 180322435
public class SandwichBuild {//Class which builds a sandwich with fixed inputs

	public static void main(String[] args) {

		Sandwich s = new Sandwich(new Bread("Thin", 0.7));//Creating a sandwich object with a new type of bread
		s.addTopping(new Topping("Ketchup", 0.3));//Directly adding toppings and fillings to the lists
		s.addTopping(new Topping("Mayo", 0.3));
		s.addFilling(new Filling("Olives", 0.5));
		s.addFilling(new Filling("Lettuce", 0.5));

		System.out.println("Your sandwich contains the following");

		for (Topping t : s.getToppings()) {//Printing the name and price of every topping and filling in the sandwich
			System.out.printf("%s for %s\n", t.getName(), t.getPrice());//in a nice format
		}

		for (Filling f : s.getFilling()) {//Same as above
			System.out.printf("%s for %s\n", f.getName(), f.getPrice());
		}

		Bread b = s.getBread();//Creating a new bread object to print it and it's value,in a nice format
		System.out.printf("Bread type is %s for %s \n", b.getName(), b.getPrice());
		System.out.println("Untaxed price is " + s.getPrice());//Calculating prices before and after VAT
		System.out.println("Taxed price is " + s.getFullPrice(s.getPrice()));
	}

}
