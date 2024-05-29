package usha;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		
		//GET INPUT FOR  ARRAYS FROM USER AND PRINT IT IN SORTED ORDER:
    /*    int count, temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        count = scan.nextInt();
    
        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) 
        {
            num[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Sorted Order: ");
        for (int i = 0; i < count - 1; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);
		
*/
		
		// GET INPUT FOR ARRAY FROM USER AND CHECK IF BOTH HAVE SAME ELEMENTS:
		int count1, count2;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number of elements in the array 1: ");
        count1 = scan.nextInt();
    
        int num[] = new int[count1];
        System.out.println("Enter array elements:");
        
        for (int i = 0; i < count1; i++) 
        {
            num[i] = scan.nextInt();
        }
        
        System.out.println("Enter number of elements in the array 2:");
        count2 = scan.nextInt();
        
        int num2[] = new int [count2];
        System.out.println("Enter array elements:");
        
        for(int i = 0; i < count2; i++)
        {
        	num2[i] = scan.nextInt();
        }
        
//        boolean result = Arrays.equals(num, num2);
//        if (result == true) 
//        {
//        System.out.println("Two Arrays are equal");
//        }
//        else
//        {
//        	System.out.println("Two Arrays are not equal");
//        }
        
        for(int i = 0; i < count1; i++)       
        {
        	if(num[i] == num2[i])
        	{
        		System.out.println("Two Arrays are Equal");	
        		break;
        	}
        	
        	else 
        	{
        		System.out.println("Two Arrays are Not Equal");
        		break;
        	}
        }
	}
}

