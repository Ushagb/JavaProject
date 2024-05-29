package usha;
import java.util.Scanner;
public class AreaofCircle {
public static void main(String args[])
{
	double r,area;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of r: ");
	r = sc.nextDouble();
	area = 3.14*r*r;
	System.out.println("Area of circle = " +area);
}
}
