
import java.util.Scanner;
public class Exam15
{
	public static void main(String[] args)
	{
	    double A,C,r;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of r:");
		 r=sc.nextDouble();
		A=3.14*r*r;
		C=2*3.14*r;
		 System.out.println("Area of Square:"+A);
		 System.out.println("Perimeter of Square:"+C);
	}
}
