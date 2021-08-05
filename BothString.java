package cool;

public class BothString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ANIL";
		String s2=new String("ANIL");
		char arr[]= {'A','N','I','L'};
		String s3=new String(arr);
		if(s1==s2) {
			System.out.println("Reference are equal");
		}else {
				System.out.println("References are not equal");
		}
		if(s1.equals(s2)) {
			System.out.println("string are equal");
		}else {
				System.out.println("strings are not equal");
		}
		if(s2==s3) {
			System.out.println("Reference are equal");
		}else {
				System.out.println("References are not equal");
		}
		if(s1.equals(s3)) {
			System.out.println("string are equal");
		}else {
				System.out.println("strings are not equal");
		}
		
	}

}
