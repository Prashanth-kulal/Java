//program to find whether given number is odd or even
import java.util.Scanner;
public class BitwiseOddOrEven {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=scanner.nextInt();
        if((num&1)==1){
            System.out.println("your number is odd");
        }else{
            System.out.println("your number is even");
        }
    }
    
}
