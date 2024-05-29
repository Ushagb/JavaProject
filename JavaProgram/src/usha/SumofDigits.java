package usha;
import java.util.Scanner;
public class SumofDigits {
public static void main(String args[])
{
	int n, sum=0,last;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	n = sc.nextInt();
	while(n>0)
	{
		last = n%10;
		sum = sum+last;
		n = n/10;
	}
	System.out.println(sum);
}
}
