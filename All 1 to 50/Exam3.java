import java.util.Scanner;
public class Exam3 {
    public static void main(String[] args) {
        //03.	write a program to find he addition of two numbers 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int c = a+b;
        System.out.println("Addition of two numbers: "+ c);
    }
    
}
