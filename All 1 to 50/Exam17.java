import java.util.Scanner;

public class Exam17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r");
        double r= sc.nextDouble();
        System.out.println("Enter h: ");
        double h =sc.nextDouble();

        double area = 2*(3.14*r*r) + 2*(3.14*r*h);
        {
            System.out.println("surface area of cylinder is: "+area);
        }

    }
    
}
