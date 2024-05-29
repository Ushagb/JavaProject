package usha;
import java.util.Scanner;
public class AmstrongNumber {
public static void main(String args[])
{
	int n=0,sum = 0,last, temp ;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number: ");
	n = sc.nextInt();
	temp=n;
	while(n>0)
	{
		last = n%10;
		sum = sum+(last*last*last);
		n = n/10;
	}
	
	if(sum==temp)
		System.out.println("It is Amstrong Number");
	else
		System.out.println("It is not Amstrong Number");
		}
}

