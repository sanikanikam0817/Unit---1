import java.util.Scanner;

public class Exam14 {
    public static void main(String[] args) {
        //14	Write a program to find the volume of a cylinder? 
        //A=4*3.14*r*r;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        int r= sc.nextInt();
        Double vol=4*3.14*r*r;
        System.out.println("Volume of Cylinder: "+vol);
    }
    
}
