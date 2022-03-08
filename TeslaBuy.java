	//Author: Divine Iloh
	//BINS 5312
	//Date: 02/19/2022

package TeslaBuy;

public class TeslaBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring variables
		double savings = 2000;
		double rate = 0.025;
		int numYears = 1;
		double MSRP = 75000;
		double amount = 0;
		
		
		System.out.println("Year" + " " + "Amount Saved");
		
		while (amount < MSRP)
		{
			amount = savings * Math.pow(1 + rate,  numYears) + amount;
			
			System.out.println(numYears + "    $" + String.format("%.2f", amount));
			numYears++;
		}
		
		
	System.out.println("\nIn year " + --numYears + " I will have " + "$" + String.format("%.2f", amount) + " to buy a Tesla");
	}

}
