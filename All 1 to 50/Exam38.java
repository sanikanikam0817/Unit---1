import java.util.Scanner;

public class Exam38 {
    public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter m:");
		double m=sc.nextDouble();
         System.out.print("Enter v: ");
		double v=sc.nextDouble();
         System.out.print("Enter g: ");
		double g=sc.nextDouble();
         System.out.print("Enter h: ");
		double h=sc.nextDouble();
		double ke=0.5*m*v*v;
		double pe=m*g*h;
		System.out.println("Kinetic Energy: "+ke);
		System.out.println("Potential Energy: "+pe);
	}

    
}
