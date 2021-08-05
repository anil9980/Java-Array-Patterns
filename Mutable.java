package cool;

public class Mutable {
public static void main(String[] args) {
	StringBuffer s1=new StringBuffer("anil");
	StringBuffer s2=new StringBuffer("anil");
	StringBuilder s3=new StringBuilder("anil");
	if(s1==s2)
	{
		System.out.println("references are equal");
	}
	else {
		System.out.println("references are unequal");
	}
	if(s1.equals(s2))
	{
		System.out.println("strings are equal");
	}
	else {
		System.out.println("strings are unequal");
	}
	System.out.println(s1.append("kumar"));
	System.out.println(s3.append("kumar"));
}
}
