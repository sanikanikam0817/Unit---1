import java.util.Scanner;
public class Exam2 {
    public static void main(String[] args) {
        //02.	Write a program to multiply and divide two numbers and print them in the form of equation 
         //(4*3=12 8/4=2)? 
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter a,b,c,d");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c= sc.nextInt();
         int d=sc.nextInt();


         System.out.println(a+"*"+b+"="+(a*b));
		 System.out.println(c+"/"+d+"="+(c/d));

       

    }
    
}
