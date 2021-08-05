package cool;

public class Pattern11 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("$");
			}
			System.out.println();
		}
		
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			for(int c=9;c>=2*a-1;c--)
			{
				System.out.print("$");
			}
			System.out.println("");
		}
		

	}

}
