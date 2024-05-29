package usha;
import java.util.Scanner;
public class JumpStatements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double i,sum = 0;
		System.out.println("Enterv the Sum of numbers:");
		while(true)
		{
			i = scan.nextDouble();
			if(i < 0.0) {
				break;
		}
		sum = sum + i;
	}
	System.out.println("Sum = " +sum);
}
}
