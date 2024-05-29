package usha;
import java.util.*;
/* gettting input from user */
public class InputDemo {
	public static  void main(String args[])
	{
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter Your Name:");
//		String name = scanner.nextLine();
//		
//		System.out.println("Enter Your Email " );
//		String email = scanner.nextLine();
//		
//		System.out.println("What is your rating? ");
//		int rating = scanner.nextInt();
//		
//		System.out.println("hello " + name);
//		System.out.println("Email: " + email);
//		System.out.println("You Rating Us " + rating);
//		
//		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = scanner.nextLine();
		
		System.out.println("enter Your Age");
		byte age = scanner.nextByte();
		
		System.out.println("Enter your Rollno:");
		short roll = scanner.nextShort();
		
		System.out.println("Enter your Contact Details");
		long contact = scanner.nextLong();
		
		System.out.println("Enter your CGPA");
		float cgpa = scanner.nextFloat();
		
		
		
		System.out.println("Hello " + name);
		System.out.println("Your Age " + age);
		System.out.println("Roll Number " + roll);
		System.out.println("Phone Number " + contact);
		System.out.println("Your CGPA " + cgpa);
		System.out.println("You entered Values are " +true);
	
		
		        
	}
}