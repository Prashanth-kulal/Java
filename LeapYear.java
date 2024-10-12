//program to check whether the given year is leap year or not
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the year to check is it leap year or not :");
        int year=input.nextInt();
        if(year%400==0||(year%4==0 && year%100!=0)){
            System.out.println("Entered year is a leap year");
        }else{
            System.out.println("Entered year is not a leap year");
        }
    }
    
}
