import java.util.Scanner;
public class FarenheitToCelsius {
        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the temperature in F:");
            float fah=input.nextInt();
            float cel=(fah-32)*5/9;
            System.out.println("The answer is:"+cel+"C");

        
    }
    
}
