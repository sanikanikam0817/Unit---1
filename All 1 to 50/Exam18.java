import java.util.Scanner;

public class Exam18 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");

        int age=sc.nextInt();
        int days=age*365;
        System.out.println("Your Age in Days is: "+days);
    }
}
