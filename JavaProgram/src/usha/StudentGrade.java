package usha;
import java.util.Scanner;
public class StudentGrade {
public static void main(String args[])
{
	int marks;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Marks of a Student: ");
	marks = sc.nextInt();
	
	if(marks>90 && marks<=100)
		System.out.print("Grade O");
	else if(marks>80 && marks<=90)
		System.out.print("Grade A+");
	else if(marks>70 && marks<=80)
		System.out.print("Grade A");
	else if(marks>60 && marks<=70)
		System.out.print("Grade B+");
	else if(marks>50 && marks<=60)
		System.out.print("Grade B");
	else
		System.out.print("Fail");
}
}
