/*program for swapping two numbers */

import java.util.Scanner;

public class Swap{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number A: ");
        int a=input.nextInt();
        System.out.print("Enter the second number B: ");
        int b=input.nextInt();

        int c=a;
        a=b;
        b=c;

        System.out.println("The value of A is:"+a);
        System.out.println("The value of B is:"+b);
    }
}