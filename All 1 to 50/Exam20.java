import java.util.Scanner;
public class Exam20 {
    ////12.	Write a program to find the square root of a given number (use sqrt () function)? Math.sqrt(a) 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of a: ");

        int a = sc.nextInt();
        double b=Math.pow(a,2);

        System.out.println("Square root of: "+b );
    }
    
}
