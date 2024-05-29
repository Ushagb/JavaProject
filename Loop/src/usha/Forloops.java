package usha;
import java.util.Scanner;
public class Forloops {

	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("Enter how many stars you want to print:");
		n = scan.nextInt();
		
		for (i = 1; i<=n; i++)
		{
			System.out.println("*");
			
		}
	}

}
