package usha;
import java.util.Scanner;
public class SumFirstNNumbers {
	public static void main(String args[]) {
		
		int i,n,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input value: ");
		n = sc.nextInt();
		
		System.out.println("First " +n+ " natural numbers are");
		for(i = 1; i<=n; i++)
		{
			System.out.println(i);
			sum+=i;
		}
		
		System.out.println("Sum of first " +n+ " natural numbers is " +sum);
	}

}
