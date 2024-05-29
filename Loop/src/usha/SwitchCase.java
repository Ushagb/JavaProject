package usha;
import java.util.Scanner;
public class SwitchCase {
      // IF AND SWITCH  STATEMENTS ARE SELECTION STATEMENTS
	public static void main(String[] args) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		a = scanner.nextInt();
		System.out.println("Enter the second number");
		b = scanner.nextInt();
		
		char operator;
		System.out.println("Enter the Operator +,-,*,/,%");
		operator = scanner.next().charAt(0);
		
		/*switch(operator)
		{
		case  '+':
			System.out.println(a + " + " + b + " = " + (a+b) );
			break;
		case '-':
			System.out.println(a + " - " + b + " = " + (a-b) );
			break;
		case '*':
			System.out.println(a + " * " + b + " = " + (a*b) );
			break;
		case '/':
			System.out.println(a + " / " + b + " = " + (a/b) );
			break;
		case '%':
			System.out.println(a + " % " + b + " = " + (a%b) );
			break;
		default:
			System.out.println("The entered oprator is not found");
	}*/
		
		if(operator == '+')
			System.out.println(a + " + " + b + " = " + (a+b) );
		else if(operator == '-')
			System.out.println(a + " - " + b + " = " + (a-b) );
		else if(operator == '*')
			System.out.println(a + " * " + b + " = " + (a*b) );
		else if(operator == '/')
			System.out.println(a + " / " + b + " = " + (a/b) );
		else if(operator == '%')
			System.out.println(a + " % " + b + " = " + (a%b) );
		else
			System.out.println("Entered oiperator is not found" );
		
	}

}
