import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        
//05.	write a program to find the multiplication of four numbers 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c,d,e");

        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int d =sc.nextInt();

        int e=a*b*c*d;

        System.out.println("Multiplication of 4 numbers is: "+e);
    }
}
