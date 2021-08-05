package cool;

import java.util.Scanner;

public class TwoDArray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the rows and coluns");
	int a=scan.nextInt();
	int b=scan.nextInt();
	
	
	int arr[][]=new int[a][b];
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
	{
			arr[i][j]=scan.nextInt();
		}
		System.out.println();
	}
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.print(arr[i][j] +" ");
		}
		System.out.println();
	}
}
}
