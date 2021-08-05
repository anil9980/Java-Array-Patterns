package cool;

public class Immutable {

	public static void main(String[] args) {
		// immutable means once created canot be altered
		//3 ways to create
		String s1="anil";
		String s2=new String("anil");
		char arr[]= {'a','n','i','l'};
		String s3=new String(arr);
		
		//without using new object will store in constant pool
		// in constatnt pool duplicates are not allowed
		
		String s4="anil";
		if(s1==s4) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		if(s1==s2) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}

		String s5="an"+"il";//adding 2 raw strings object stored in cp
		String s6="an"+"il";
		if(s1==s5&&s5==s6) {
			System.out.println("References are equal");
			
		}
		else {
			System.out.println("References are unequal");
		}
		String s7=s1+s2;//stored in non constant pool
		String s8=s1+s2;
		if(s7==s8) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		String s9="anil";
		String s10=s9.concat("kumar");
		System.out.println(s9);
		System.out.println(s10);
		
		String s11="kod";
		String s12=s11.intern();
		String s13="kod";
		
		if(s12==s13) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		String s14="nest";
		String s15=s14;//references are equal
		
		if(s14==s15) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		
		if(s12.equals(s13)) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings are unequal");
			
			
		}
		
		String s16="anil";
		String s17="ANIL";
		
		if(s16.equals(s17)) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings are unequal");
			
			}
		
		if(s16.equalsIgnoreCase(s17)) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings are unequal");
			
			
		}
		String s18="akash";
		String s19="anil";
		if(s18.compareTo(s19)>0) {
			System.out.println("akash is greater");
		}
		else if(s18.compareTo(s19)<0){
			System.out.println("anil are unequal");
		}
		else
		{
			System.out.println("both strings are equal");
		}
		
		String s20="anil";
		String s21=s20.toUpperCase();
		System.out.println(s21);
		
		String s22="KUMAR";
		String s23=s22.toLowerCase();
		System.out.println(s23);
		
		String s24="anil kumar";
		boolean s25=s24.contains("an");
		System.out.println(s25);
		
		boolean s26=s24.contains("AN");
		System.out.println(s26);
		
		int s27=s24.indexOf('k'); //5
		System.out.println(s27);
		
		char s28=s24.charAt(5);
		System.out.println(s28);//k
		
		String s29=s24.substring(5);
		String s30=s24.substring(5,7);
		System.out.println(s29);
		System.out.println(s30);
		
		
		
		
		
		
	}

}
