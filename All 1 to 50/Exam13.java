import java.util.Scanner;

public class Exam13 {
    public static void main(String[] args) {
        //13.Write a program to find the area of a sphere
        //A=4*3.14*r*r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int r=sc.nextInt();
        double area=4*3.14*r*r;

        System.out.println("Area of Sphere is: "+ area);
    }
    
}
