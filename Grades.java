//program to calculate grades based on marks
import java.util.Scanner;
public class Grades {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the marks scored in percentage : ");
        float marks=input.nextFloat();
        if(marks>=90){
            System.out.println("grade is : A");
        }else if(marks>=75){
            System.out.println("grade is : B");
        }else if(marks>=60){
            System.out.println("grade is : C");
        }else if(marks>=30){
            System.out.println("grade is : D");
        }else{
            System.out.println("grade is : F");
        }

    }
    
}
