import java.util.Scanner;

public class FibanocciSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number where you want to stop the series:");
        int num=input.nextInt();
        System.out.println("Here is the fibanocci series");
        printFibanocci(num);
    }
    public static void printFibanocci(int num){
        if(num<0)return;
        System.out.print("0 ");
        if(num==0)return;
        System.out.print("1 ");
        int firstNum=0;
        int secondNum=1;
        while(firstNum+secondNum<=num){
        int thirdNum=firstNum+secondNum;
        System.out.print(thirdNum+" ");
        firstNum=secondNum;
        secondNum=thirdNum;
    }
  }
}
