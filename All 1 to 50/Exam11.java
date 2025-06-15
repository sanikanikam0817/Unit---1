import java.util.Scanner;

public class Exam11 {
    //13.Write a program to find the area and perimeter of a square 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int s=sc.nextInt();
        double a= s*s;
        double perimeter=4*s;

        System.out.println("Area of Square: "+a);
        System.out.println("Perimeter of Square: "+perimeter);
    }

}
