//program to categories the person into diffrent age group
import java.util.Scanner;
public class AgeGroups {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the age of the person :");
        int age=input.nextInt();
        if(age<=13){
            System.out.println("child");
        }else if(age<=20){
            System.out.println("teen");
        }else if(age<=60){
            System.out.println("adult");
        }else{
            System.out.println("senior");
        }
    }
    
}
