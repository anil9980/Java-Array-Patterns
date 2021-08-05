package cool;

import java.util.Scanner;

public class AssecendingBinarySearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int l=sc.nextInt();
	int arr[]=new int[l];
	System.out.println("enter array contens ");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("entered array contens are");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	//System.out.println();
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println(" asending contens are ");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("enter a key");
	int key=sc.nextInt();
	int low=0,high=arr.length-1,mid;
	while(low<=high) {
		mid=(low+high)/2;
		if(key==arr[mid]) {
			System.out.println("key found at "+mid);
			System.exit(0);
		}
		else if(key>arr[mid]) {
			low=mid+1;
			high=high;
		}
		else {
			low=low;
			high=mid-1;
		}
		
	}
	System.out.println("key not found");
}
}
