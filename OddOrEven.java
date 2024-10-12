//Program to check whether the given number is odd or even
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();
        if(num==0){
            System.out.println("given number is zero ");
        }else if(num%2==0){
            System.out.println("Given number is Even");
        }else {
            System.out.println("Given number is odd");
        }
        

    }
    
}
