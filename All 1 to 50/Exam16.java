import java.util.Scanner;

public class Exam16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l");
        double l = sc.nextDouble();
        System.out.println("Enter w");
        double w = sc.nextDouble();
        System.out.println("Enter h");
        double h = sc.nextDouble();

        double v= l*w*h;
        {
            System.out.println("Volume of Cuboid is: "+v);
        }
        double area= 2*((l*w)+(l*h)+(w*h));
        {
            System.out.println("Area of Cuboid is: "+area);
        }

    }
    
}
