import java.util.Scanner;

public class Exam23 {
    //Write a program to read the marks of 5 subjects and display the total, per, class 
public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
   

    System.out.print("Marks of Python:");
    double python = sc.nextDouble();

    System.out.print("Marks of Java:");
    double java = sc.nextDouble();

    System.out.print("Marks of Dotnet:");
    double dotnet = sc.nextDouble();

    System.out.print("Marks of CPP:");
    double cpp= sc.nextDouble();

    System.out.print("Marks of Javascript:");
    double javascript = sc.nextDouble();

    double total=(python+java+cpp+javascript);
    double per=total/500*100;
 
    if(per<=80 && per>=100){
        System.out.println("Excellent ");
    }else if(per<60 && per>80){
        System.out.println("Good");
    }else if( per == 35 && per>=60){
        System.out.println("You have to studied well");
    }
    else{
        System.out.println("Better Luck next time :( ");
    }


    System.out.println("Total of marks is: "+total);
    System.out.println("Percentage you got: "+per);
    
   


}
} 
