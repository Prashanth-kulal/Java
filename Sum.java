/*finding sum of two number*/
import java.util.Scanner;
public class Sum{
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int n1=input.nextInt();
      System.out.print("Enter the second number: ");
      int n2=input.nextInt();
      int ans=n1+n2;
      System.out.println("sum= " +ans);
}
}