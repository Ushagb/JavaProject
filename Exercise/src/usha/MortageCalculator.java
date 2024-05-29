package usha;

import java.util.Scanner;
import java.text.NumberFormat;
public class MortageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.print("Principal: ");
		int result = scanner.nextInt();
		System.out.print("Annual Interest: ");
		double result1 = scanner.nextDouble();
		System.out.print("Period (Years): ");
		int result2 = scanner.nextInt()	;	
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result3 = currency.format(result*result1*result2);
		System.out.print("Mortage: " +result3 );
		

	}

}
