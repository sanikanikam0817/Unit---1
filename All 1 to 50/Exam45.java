import java.util.Scanner;

public class Exam45 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//09.	The distance between two cities in Km. is input through the keyboard. 
//Write a program to convert and print the result in meters and centimetres? 
        System.out.println("The distance between two cities in Kilometers: ");
        int km=sc.nextInt();
       
        
        double m = km*1000;
        double cm=km*10000;
        {
        
            System.out.println("The dis. in Meter is: " + m + " Meter");
            System.out.println("The dis. in Centimeter is: " + cm + " Centimeter");
          

        }
        
        
     }
   
 }

