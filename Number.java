//program to find given number is positive,negative or zero
import java.util.Scanner;
public class Number {
       public static void main(String[] args){
        Scanner input=new Scanner(System.in);
            System.out.print("Enter the number:");
            double num=input.nextDouble();
            if (num==0){
                System.out.println("Given number is zero");
            }else if(num>0){
                System.out.println("Given number is positive");
            }else{
                System.out.println("Given number is negative");
            }



        }
    }
    

