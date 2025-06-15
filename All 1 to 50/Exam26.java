import java.util.Scanner;
public class Exam26 {

    public static void main(String[] args) 
    {
        double l,b,h,l1,h1,l2,h2,Total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l,b,h of room ");
        l=sc.nextDouble();
        b=sc.nextDouble();
        h=sc.nextDouble();
        System.out.println("Enter l1,h1 of door ");
        l1=sc.nextDouble();
        h1=sc.nextDouble();
        System.out.println("Enter l2,h2 of window ");
        l2=sc.nextDouble();
        h2=sc.nextDouble();
        Total=(2*(l+b)+2*(b+h)+2*(l+h)-(l1*h1)-(l2*h2)-(l*b));
        System.out.println( "Total Area to be printed"+Total) ;
    }
}