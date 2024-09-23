import java.util.Scanner;
public class H3{
	public static void main(String[] args){
            Scanner sc1=new Scanner(System.in);
            int n1=sc1.nextInt();

            /*for take double as input*/

		double[][]matrix1=new double[n1][n1];
		double[][]matrix2=new double[n1][n1];
		System.out.println("Enter of the first matrix");
		for(int i=0;i<n1;i++){
			for(int j=0;j<n1;j++){
				matrix1[i][j]=sc1.nextDouble();}}
		System.out.println("Enter elements of the second matrix");
		for(int i=0;i<n1;i++){
			for(int j=0;j<n1;j++){
				matrix2[i][j]=sc1.nextDouble();}}
		double[][]matrix3=new double[n1][n1];
		for(int i=0;i<n1;i++){
			for(int j=0;j<n1;j++){
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];}}
		System.out.println("The sum of the two matrices is ");
		for(int i=0;i<n1;i++){
			for(int j=0;j<n1;j++){
				System.out.print(matrix3[i][j]+"\t");}
			System.out.println();}}}