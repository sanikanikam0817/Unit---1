import java.util.Scanner;

public class Exam25 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mass: ");
        double m = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        System.out.print("Enter Velocity: ");
        double v = sc.nextDouble();

        double g = 9.8;
    

        double  e =(m*g*h)+ (0.5*m* Math.pow(v,2));
       // System.out.println("The Mechanical Energy is: " + e);
       System.out.println(String.format("The Mechanical Energy is :  %3f ",e));



    }
    
}
// (m*g*h)+ (0.5*m*v*v)
//(m*g*h)+ (0.5*m* math pow(v,2));

// System.out.println(string.format("The Mechanical Energy is :  %3f ",e));
