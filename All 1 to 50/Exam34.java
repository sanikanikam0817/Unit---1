import java.util.Scanner;

public class Exam34 {
        public static void main(String[] args) 
    {
        int l,ml,x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mililiter: ");
        ml = sc.nextInt();
        l= ml/1000;
        x=ml%1000;
        System.out.println( l+" litre" + x+" ml" ) ;
    }    

    
}
