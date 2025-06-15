import java.util.Scanner;

public class Exam36 {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Seconds: ");
        int sec = sc.nextInt();

        int hh = sec / 3600;
        int mm = (sec % 3600) / 60;
        int ss = (sec % 3600) % 60;
        
        System.out.println(hh + ":" + mm + ":" +ss);
    }
    
}
