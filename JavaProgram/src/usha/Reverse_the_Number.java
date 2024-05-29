package usha;

public class Reverse_the_Number {
public static void main(String args[])
{
	int n=123,last,rev=0;
	while(n>0)
	{
		last = n%10;
		rev = (rev*10)+last;
		n = n/10;
	}
	System.out.println(rev);
}
}
