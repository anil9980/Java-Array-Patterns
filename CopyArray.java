package cool;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int l=sc.nextInt();
		int arr1[]=new int[l];
		int arr2[]=new int[l];
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.println("enter an element of"+" "+i);
			arr1[i]=sc.nextInt();
			
		}
		int j=arr1.length-1;
		for(int i=0;i<=arr1.length-1;i++) {
			
			arr2[j]=arr1[i];
			j--;
		}
		System.out.println("orginal array");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("copied array");
		for(int i=0;i<=arr2.length-1;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
	}

}
