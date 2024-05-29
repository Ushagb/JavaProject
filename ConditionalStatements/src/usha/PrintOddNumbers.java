package usha;
import java.util.Scanner;
public class PrintOddNumbers {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Input: ");
		int n = sc.nextInt();
		
		System.out.println("First n natural numbers: " +n);
		
		int count = 0;
		int number = 1;
		
		while(count < n)
		{
			if(number%2 != 0) {
				System.out.println(number);
				count++;
			}
			number++;
		}
	}

}
