package cool;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an num");
		int a=sc.nextInt();
		System.out.println(a);
		
		System.out.println("enter a real num");
		float b=sc.nextFloat();
		System.out.println(b);
	
		System.out.println("enter a byte num");
		byte c=sc.nextByte();
		System.out.println(c);
		
		System.out.println("enter a short num");
		short d=sc.nextShort();
		System.out.println(d);
		
		System.out.println("enter a long num");
		long e=sc.nextLong();
		System.out.println(e);
		
		System.out.println("enter a double num");
		double f=sc.nextDouble();
		System.out.println(f);
		
		System.out.println("enter a boolean");
		boolean g=sc.nextBoolean();
		System.out.println(g);
		
		System.out.println("enter a string");
		String h=sc.next();
		System.out.println(h);
		
		sc.nextLine();
		System.out.println("enter a next line string num");
		String i=sc.nextLine();
		System.out.println(i);
		
		System.out.println("enter any word it prints one letter");
		char j=sc.next().charAt(1);
		System.out.println(j);
	
	}
	
}
