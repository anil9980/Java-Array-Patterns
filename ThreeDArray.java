package cool;

import java.util.Scanner;

public class ThreeDArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of blocks");
	int a=sc.nextInt();
	System.out.println("enter the length rows");
	int b=sc.nextInt();
	System.out.println("enter the length columns");
	int c=sc.nextInt();
	
	int arr[][][]=new int[a][b][c];
	
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
	{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
			   arr[i][j][k]=sc.nextInt();
			   
			}
		}
	}

	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
			   System.out.print(arr[i][j][k]+" ");
			   
			}
			System.out.println();
		}
	}

}
}
