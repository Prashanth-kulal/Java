/*program to find the perimeter of the rectangle */
import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the size of all four side in cm : ");

        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double d=input.nextDouble();

        System.out.println("The perimeter of the rectangle is: "+ (a +b +c +d) +"cm");
    }
    
}
