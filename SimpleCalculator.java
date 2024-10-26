import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        int n1=4;
        int n2=8;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your choice");
        System.out.println("1.sum\t2.difference\t3.product\t4.division\t5.quotient\t6.remainder\t7.exponential");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("Result:"+(n1+n2));
                break;
            case 2:
                System.out.println("Result:"+(n1-n2));
                break;
            case 3:
                System.out.println("Result:"+(n1*n2));
                break; 
            case 4:
                if(n2!=0){
                    System.out.println("Result:"+((double)n1/(double)n2));
                }else{
                    System.out.println("Error:division by zero is undefined");
                }    
                break;
            case 5:
                if(n2!=0){
                    System.out.println("Result:"+(n1/n2));
                }else{
                    System.out.println("Error:division by zero is undefined");
                }    
                break; 
            case 6:
                if(n2!=0){
                    System.out.println("Result:"+(n1%n2));
                }else{
                    System.out.println("Error:division by zero is undefined");
                }    
                break; 
            case 7:
                System.out.println("Result:"+Math.pow(n1,n2));
                break; 
            default:
                System.out.println("Invalid choice!");
        }
    }
}
        