/* Travis Hammonds
 * Lab 6 CD
 * Oct 20 2021
 * Dr.Nazli Hardy
 */
public class CDInterest {

	public static void main(String[] args) {
		calculateInterest(1000,25,6.5,100); //calls method
	}
	
	public static void calculateInterest(double p, double t, double r, double c) {
		System.out.println("Year" + "\t" + "Interest " + "\t" + " Deposit" + "\t" + "New Balance"); //prints column headers
		System.out.println("start" + "\t\t\t\t\t" + p); //prints first line with starting balance
		r = r/100; //converts rate to decimal
		double balance = p; //sets initial balance
		for (int i =1; i<=t; i++) { //initializes loop for 25 years of accrued compound interest
			System.out.print(i + "\t"); // //print year
			double interest = round(balance*r); // set interest equal to the balance multiplied by rate
			System.out.print(interest + "\t\t"); // print the interest accrued
			System.out.print(c + "\t\t"); //print the yearly deposit
			balance = round(balance + interest + c); //set balance equal to previous balance + interest made + deposit, then call round method to format in dollars
			System.out.println(balance);//print new balance
		}
	}
	public static double round(double n) { // create method to round numbers in format of dollar amount
		double c = (int) (n*100)/100.0; //cast to int and divide by double 
		return c; //return the value
	}
}
