import java.net.SocketPermission;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number A: ");
        int a=input.nextInt();
        System.out.print("Enter the second number: ");
        int b=input.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
    
}
