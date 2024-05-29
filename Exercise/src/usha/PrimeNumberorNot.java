package usha;
import java.util.Scanner;
public class PrimeNumberorNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		System.out.print("Enter a number: ");
		n = scan.nextInt();
		
		int count = 0;
		for(int i = 2; i <= n / 2; i++) {
		if(n % i == 0)
		{
			count++;
			break;
		}
		}
		if(count == 0 && n !=1)
		{
			System.out.println("It is a Prime Number ");
		}
		else
		{
			System.out.println("It is not a Prime Number ");
		}

	}

}
