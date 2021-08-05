package cool;

public class NewString {
public static void main(String[] args) {
	String s1=new String("Anil");
	String s2=new String("Anil");
	if(s1==s2) {
		System.out.println("Reference are equal");
	}
	else {
		System.out.println("Reference are not equal");
	}
	if(s1.equals(s2)) {
		System.out.println("Strings are equal");
	}
	else {
		System.out.println("Strings are not equal");
	}
}
}

