import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        //06.	write a program to find addition of 5 numbers 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        int f=a+b+c+d+e;

        
        System.out.println("Addition of Five numbers: "+ f);
    }
}
