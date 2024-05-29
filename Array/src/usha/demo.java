package usha;
import java.util.Scanner;
public class demo {
	public static void main(String args[])
	{
//		int num[] = {1,2,3,4,5};   //one type of array declaration
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
		
//		int num[] = new int[5];
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;
//		num[4] = 50;
//		
//		System.out.println(num[3]);
		int a[] = new int[10];
		
		Scanner myNum = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		
		for(int i = 0; i<a.length; i++) {
		a[i] = myNum.nextInt();
		}
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	}

