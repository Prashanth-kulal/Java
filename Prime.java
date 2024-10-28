import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter your number:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        boolean prime=prime(num);
        if(prime){
            System.out.println("is a prime number");
        }
        else{
            System.out.println("not a prime number");
        }


    }
    public static boolean prime(int num){
        int i=2;
        while(i<num){
            if(num%i==0){
                return false;
        }
        i++;
        }return true;
    }
}
