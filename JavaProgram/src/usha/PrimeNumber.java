package usha;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String args[])
{
	int n,f=0; //flag value
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter value of n: ");
	n = sc.nextInt();
	for(int i=2; i<n; i++)
	{
		if(n%i==0)
		{
			f=1;
		}
	}
	if(f==0)
		System.out.print(n+" is prime number");
	else
		System.out.print(n+" is not prime number");
}
}
