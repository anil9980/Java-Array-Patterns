package cool;

import java.util.Scanner;

public class BinarySearchArray {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the siz eof array");
	int l=sc.nextInt();
	int arr[]=new int[l];
	System.out.println("enter array contents");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println(" array contents are");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("enter a key to search");
	int key=sc.nextInt();
	int low=0;
	int high=arr.length-1;
	int mid;
	while(low<=high)
	{
		mid=(low+high)/2;
		if(key==arr[mid]) {
			System.out.println("key found at index"+mid);
			System.exit(0);
			
		}
		else if(key >mid) {
			low=mid+1;
			high=high;
		}
		else {
			high=mid-1;
			low=low;
		}
	}
	System.out.println("key not found");
	
}
}
