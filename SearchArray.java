package cool;

import java.util.Scanner;

public class SearchArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int l=sc.nextInt();
		int arr[]=new int[l];
		System.out.println("enter array contents");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter a"+" "+ i+" "+"element");
			arr[i]=sc.nextInt();
		}
		System.out.println("the entered array is");
		for(int i=0;i<=arr.length-1;i++) {
			//System.out.println("enter a"+" "+ i+" "+"element");
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("enter a key");
		int key=sc.nextInt();
		for(int i=0;i<arr.length-1;i++) {
			if(key==arr[i]) {
				System.out.println("key found at"+" "+i+" "+"index");
				//break;
				System.exit(0);
			}
			//else {
				//System.out.println("key not found");
			//}
			
		}
		System.out.println("key not found");
		
	}

}
