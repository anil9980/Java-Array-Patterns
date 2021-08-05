package cool;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a length");
		int n=sc.nextInt();
		System.out.println("entered lenght is "+n);
		
		int arr[]=new int[n];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
			//System.out.println(arr[i]);
			
		}
		for(int i=0;i<=arr.length-1;i++)
			
		{
			
		   System.out.println(arr[i]);
		}
		
	}

}
