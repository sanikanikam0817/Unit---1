import java.util.Scanner;

public class Exam27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        double HRA = 0.3 * salary;
        double TA = 0.1 * salary;

        double grossSalary = salary + HRA + TA;

        System.out.println("Gross Salary: Rs."  + grossSalary);

        
        
    }
    
}
