package usha;
import java.util.Scanner;
public class Alphabets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char alphabets;
		System.out.println("Enter the alphabet a to Z");
		alphabets = scanner.next().charAt(0);
		
		switch(alphabets)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It is Vowel");
			break;
		default:
			System.out.println("It is Consonent");
			
		}

	}

}