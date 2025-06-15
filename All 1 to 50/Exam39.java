import java.util.Scanner;

public class Exam39 {
    public static void main(String[] args)
	{

	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a=sc.nextInt();
         System.out.print("Enter b: ");
		int b=sc.nextInt();
		double am=(a+b)/2;
		System.out.println("Arithmetic Mean: "+am);
		double h=(a-b)/2;
		 System.out.println("Harmonic Mean: "+h);
	}

    
}
