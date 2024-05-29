package usha;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
//		int num[] = new int[5];
//		num[0] = 1;
//		num[1] = 2;
		
//		System.out.println(Arrays.toString(num));   // To Representation or Declare the numbers in array ;  O/P: [1,2,0,0,0]
		
		int num[] = {3,4,1,2,8};
		Arrays.sort(num);                  //Sorting of an Array
		System.out.println(num.length);      //Arrays are fixed length
		System.out.println(Arrays.toString(num));
	}

}
