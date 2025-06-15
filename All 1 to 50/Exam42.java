import java.util.Scanner;

public class Exam42 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Milk in Litre: ");
        int milk = sc.nextInt();

        double cost_price = milk * 3.25;
        
        int water = milk /4;
        int wateredMilk = milk  + water;

        double selling_price = wateredMilk * 4.15;

        double gain = selling_price - cost_price;

        System.out.println("Gain: " + gain);
    }
    
}
