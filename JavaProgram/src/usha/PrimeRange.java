package usha;

public class PrimeRange {
public static void main(String args[])
{
	int f = 0, n=100;
	for(int i=2; i<=n; i++)
	{
		f=0;
		for(int j=2; j<i; j++)
		{
			if(i%j==0)
			{
				f=1;
			}
		}
		if(f==0)
			System.out.println(i);
	}
}
}
