package cool;

public class Reference {

	public static void main(String[] args) {
		String s1="Anil";
		String s2="Anil";
		if(s1==s2) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("strings are not equal");
		}

	}

}
