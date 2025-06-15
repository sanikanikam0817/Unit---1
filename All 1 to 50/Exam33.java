import java.util.Scanner;

public class Exam33 {

      public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hours: ");
        int hh = sc.nextInt();

        System.out.print("Enter Minutes: ");
        int mm = sc.nextInt();

        System.out.print("Enter Seconds: ");
        int ss = sc.nextInt();

        int sec = hh * 3600 + mm * 60 + ss;

        System.out.println(hh + ":" + mm + ":" +ss);
        System.out.println("Total Seconds: " +sec);
    
    }
    
}
