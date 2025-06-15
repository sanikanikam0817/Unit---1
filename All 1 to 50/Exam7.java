import java.util.Scanner;

public class Exam7 {
    public static void main(String[] args) {
        //write a program to find the area of circle
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter r");
         double r= sc.nextInt();
         double a=3.14*r*r;
         System.out.println("Area of Circle is: "+ a);
    }
}
