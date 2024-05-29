package usha;

public class Palindrome {
public static void main(String args[])
{
	int n=121,last,rev=0, t=n;
	while(n>0)
	{
		last = n%10;
		rev = (rev*10)+last;
		n = n/10;
	}
	if(rev==t)
		System.out.println(t+" Palindrome Number");
	else
		System.out.println(t+" Not a Palindrome Number");
}
}
