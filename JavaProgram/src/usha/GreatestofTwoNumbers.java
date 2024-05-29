package usha;
import java.util.Scanner;
public class GreatestofTwoNumbers {
public static void main(String args[])
{
	int a,b;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter value of a: ");
	a = sc.nextInt();
	System.out.print("Enter value of b: ");
	b = sc.nextInt();
	
	if(a>b)
		System.out.println("A is greater");
	else
		System.out.println("B is greater");
}
}
