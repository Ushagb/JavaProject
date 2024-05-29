package usha;
import java.util.Scanner;
public class SwitchDays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char days;
		System.out.println("Enter the Number 1 to 7");
		days = scanner.next().charAt(0);
				
		switch(days)
		{
		case '1':
			System.out.println("Monday");
			break;
		case '2':
			System.out.println("Tuesday");
			break;
		case '3':
			System.out.println("Wednesday");
			break;
		case '4':
			System.out.println("Thursday");
			break;
		case '5':
			System.out.println("Friday");
			break;
		default:
			System.out.println("Weekends");
		}
		
		

	}

}
