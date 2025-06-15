import java.util.Scanner;

public class Exam43 {

    public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Tempreture Fahrenheit: ");
		 double fah =sc.nextDouble();

		 double C= (fah - 32) * (5.0 / 9.0);
         System.out.println("Fahrenheit: " + fah);
		System.out.println("Celsius: "+C);
	}

    
}
