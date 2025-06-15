import java.util.Scanner;

public class Exam37 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Doller: ");
        double doller = sc.nextDouble();

        double RS = doller * 86.50;
        System.out.println("Doller in Rupees: " + RS);

    }
    
}
