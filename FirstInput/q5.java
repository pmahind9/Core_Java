
import java.util.Scanner;
class SqaurePerimeterCalculator{


     public static void main (String [] ram)
     {
Scanner sc=new Scanner(System.in);

System.out.println("Enter The side length of rectangle: ");
double length= sc.nextDouble();
System.out.println("Enter width of rectangle:");
double width = sc.nextDouble();
double perimeter = 2 * (length + width);


		System.out.println("The Perimeter of rectangle is: "+ perimeter);
        
         
    }

 }
