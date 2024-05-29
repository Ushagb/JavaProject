package usha;
import java.util.Scanner;
public class ArithmeticOperation {
	public static void main(String args[]) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of a: ");
		a = sc.nextInt();
		System.out.print("Enter the value of b: ");
		b = sc.nextInt();
		
		System.out.println("Enter the operator to perform +,-,*,/,%");
		char operator = sc.next().charAt(0);
		
		switch(operator)
		{
		case '+':
			System.out.println(a+ " + " +b+ " = " +(a+b));
			break;
		case '-':
			System.out.println(a+ " - " +b+ " = " +(a-b));
			break;
		case '*':
			System.out.println(a+ " * " +b+ " = " +(a*b));
			break;
		case '/':
			System.out.println(a+ " / " +b+ " = " +(a/b));
			break;
		case '%':
			System.out.println(a+ " % " +b+ " = " +(a%b));
			break;
		default:
			System.out.println("Enter the valid operator");
		
			
		}
	}

}
