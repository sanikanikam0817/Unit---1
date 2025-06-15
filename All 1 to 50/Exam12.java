import java.util.Scanner;

public class Exam12 {
    //	A=3.14*r*r;
	//	C=2*3.14*r;
    //Write a program to find the area and circumference of a circle
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number: ");

        double a=sc.nextInt();
        double r =sc.nextInt();
        double area=3.14*r*r;
        double p=2*3.14*r;

        System.out.println("Area of circle is: "+area);
        System.out.println("Perimeter of circle is: + p");

    }

}
