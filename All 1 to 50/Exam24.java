import java.util.Scanner;

public class Exam24 {
    // a program to find the simple interest and compound interest? 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter p");
        double p= sc.nextDouble();

        System.out.println("Enter r");
        double r=sc.nextDouble();

        System.out.println("Enter n");
        double n=sc.nextDouble();

        System.out.println("Enter t");
        int t=sc.nextInt();
         
        double a= Math.pow(1+(r/n),n*t)*p;

        System.out.println("Interest is: "+a);
         
    }
}
