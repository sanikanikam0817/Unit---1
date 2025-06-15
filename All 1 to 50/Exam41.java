import java.util.Scanner;

public class Exam41 {
    public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of Divident:");
		 double dividend=sc.nextDouble();
         System.out.print("Enter the value of Divisor:");
		 double divisor=sc.nextDouble();
		 double q= dividend/divisor;
		double r=dividend % divisor;
		System.out.println("Quotient: "+q+ "  Remainder: "+r);
	}

    
}
