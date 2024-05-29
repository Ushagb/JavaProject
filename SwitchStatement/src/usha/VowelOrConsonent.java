package usha;
import java.util.Scanner;
public class VowelOrConsonent {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Alphabet: ");
		char alpha = sc.next().charAt(0);
		
		switch(alpha)
		{
		case 'a','e','i','o','u':
			System.out.println("It is an Vowel");
		break;
		default:
			System.out.println("It is a consonent");
		}
	}

}
