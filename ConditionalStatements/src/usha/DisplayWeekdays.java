package usha;
import java.util.Scanner;
public class DisplayWeekdays {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number ");
		int n = sc.nextInt();
		
		switch (n) {
		case 1:
			if(n==1) {
			System.out.println("Monday");
			}
		break;
		case 2:
			if(n==2) {
			System.out.println("Tuesday");
			}
		break;
		case 3:
			if(n==3) {
			System.out.println("Wednesday");
			}
		break;
		case 4:
			if(n==4) {
			System.out.println("Thursday");
			}
		break;
		case 5:
			if(n==5) {
			System.out.println("Friday");
			}
		break;
		case 6:
			if(n==6) {
			System.out.println("Saturday");
			}
		break;
		case 7:
			if(n==7) {
			System.out.println("Sunday");
			}
		break;
		default:
			System.out.println("invalid data");
		
			
		
			
		
	}
	}
}

