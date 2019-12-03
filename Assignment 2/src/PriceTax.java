//Code written by Calabangiu Tudor student number 180322435
public class PriceTax {// Class to calculate the price after tax

	public static final double taxRate = 0.2;// Setting the tax to a fixed value

	public double getFullPrice(double untaxedPrice) {// Method which takes the normal price and applies tax to it
		return untaxedPrice + untaxedPrice * taxRate;
	}

}
