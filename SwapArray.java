package cool;

import java.util.Scanner;

public class SwapArray {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the length of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("enter an element");
		arr[i]=sc.nextInt();
		
	}
	System.out.println("before Swapping");
	for(int i=0;i<=arr.length-1;i++)
	{
		
		System.out.print(arr[i]+ " ");
		
	}
	System.out.println();
	System.out.println("enter 2 index to swap");
	int ind1=sc.nextInt();
	int ind2=sc.nextInt();
	int temp;
	temp=arr[ind1];
	arr[ind1]=arr[ind2];
	arr[ind2]=temp;
	System.out.println("after swapping");
	for(int i=0;i<=arr.length-1;i++)
	{
		
		System.out.print(arr[i]+ " ");
		
	}
	
	System.out.println();
}
}
