package usha;
import java.util.Scanner;
public class ReverseString {
	public static void main(String args[]) {
		
		Scanner bc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String input = bc.nextLine();
		
		String reversed = " ";
		for(int i = input.length()-1; i>=0; i--)
		{
			reversed += input.charAt(i);
		}
		System.out.println("The reversed String is: " +reversed);
		
	}
}
