import java.util.Scanner;

public class Exam22 {
    //Write a program to print the area of triangle if three sides are given? 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter s1");
    double s1=sc.nextInt();
    System.out.println("Enter s2");
    double s2=sc.nextInt();
    System.out.println("Enter s3");
    double s3=sc.nextInt();
   
    double c=(s1+s2+s3)/2;
     System.out.print("Area of trianghle if 3 sides are given: "+c);
  
}
}
//A=s(s-a)(s-b)(s-c)