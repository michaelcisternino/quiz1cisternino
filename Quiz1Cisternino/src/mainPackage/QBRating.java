/* @author Michael Cisternino
 * Quiz 1 Question 1
 */
package mainPackage;

import java.util.Scanner;


/* QBRating accepts five arguments from the user - number of pass completions, pass attempts,
 * passing yards, touchdown passes, and interceptions - and calculates the user's 
 * QB rating.
*/
public class QBRating {
/* main accepts 5 arguments from the user and plugs them into equations to calculate
 * the user's QB rating
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double comp;
		System.out.println("How many pass completions?");
		comp = scan.nextDouble();
		double att;
		System.out.println("How many pass attempts?");
		att = scan.nextDouble();
		double yds;
		System.out.println("How many passing yards?");
		yds = scan.nextDouble();
		double td;
		System.out.println("How many touchdown passes?");
		td = scan.nextDouble();
		double cep;
		System.out.println("How many interceptions?");
		cep = scan.nextDouble();
		// Formulas to calculate QB rating are from Wikipedia
		double a;
		double b;
		double c;
		double d;
		a = ((comp / att) - .3) * 5;
		b = ((yds / att) - 3) * .25;
		c = (td / att) * 20;
		d = 2.375 - ((cep / att) * 25);
		
		double rating;
		rating = ((a + b + c + d) / 6);
		
		System.out.println("Your QB rating is " + rating);
		System.out.printf("%3.1f", 1234.56);
		
		
	}

}
