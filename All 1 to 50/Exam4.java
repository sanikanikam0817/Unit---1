import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");

      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = a-b-c;

      System.out.println("Substraction of three numbers is: "+d);
    }
    
}
