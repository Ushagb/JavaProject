package usha;
import java.util.Scanner;
public class FactorialofaNumber {

	public static void main(String[] args) {
		
		int n;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number you want to find factorial: ");
		n = scan.nextInt();	
		
/*		int i,fact=1;
		for(i = 1; i <= n; i++)
		{
			fact = fact * i;
		}
*/
		
		int i,fact=1;
		i = 1;
		while(i <= n)
		{
		   fact = fact*i;
		   i++;
		}
		System.out.println("Factorial of " +n+ " is " +fact);

	}

}
