package usha;
import java.util.Scanner;
public class Sum_ofNnumbers {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int n;
	System.out.println("Enter the sum of numbers: ");
	n = scan.nextInt();
	
/*	i = 1;
	while(i<=n)
	{
		sum = sum + i;
		i = i + 1;
	}
*/
	int i,sum = 0;
	for(i = 1; i <= n; i++)
	{
		sum = sum+i;
	}
	System.out.println("Addition of first " + n +" numbers are: " +sum);

	}

}
