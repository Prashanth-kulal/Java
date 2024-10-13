//program to find the greatest of three numbers
import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=input.nextInt();
        System.out.print("Enter the 2 number: ");
        int num2=input.nextInt();
        System.out.print("Enter the 3 number: ");
        int num3=input.nextInt();
        if(num1>=num2 && num1>=3){
            System.out.println("num1 is gretaer then the other two");
        }else if(num2>=num1 && num2>=num3){
            System.out.println("num2 is gretaer then the other two");
        }else{
            System.out.println("num3 is gretaer then the other two");
        }
    }
    
}
