package usha;
import java.util.Scanner;
public class N_OddNumbers {

	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("Enter the Number:");
		n = scan.nextInt();
		
		for(i = 1; i<=2*n; i++)
		{
			if(i%2!=0) {
			System.out.println("Odd numbers are: " +i);
			}
		}
		
		
	}

}
