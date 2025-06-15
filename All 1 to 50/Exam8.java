import java.util.Scanner;

public class Exam8 {
    public static void main(String[] args) {
        //area of traingle
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter b ");
        double b=sc.nextInt();
        System.out.println("Enter h");
        double h=sc.nextInt();

        double a= 0.5*b*h;
        System.out.println("Area og Triangle: "+a);
    }
}
