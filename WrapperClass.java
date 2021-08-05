package cool;
import java.util.*;
public class WrapperClass {
public static void main(String[] args) {
	
	Character a='x';
	System.out.println(a);
	
	Character b=new Character('x');
	System.out.println(b);
	
	Byte c=12;
	System.out.println(c);
	
	Byte d=new Byte((byte)10);
	System.out.println(d);
	
	Short e=new Short((short)20);
	System.out.println(e);
	
	Short f=13;
	System.out.println(f);
	
	Integer g=3635;
	System.out.println(g);
	
	Integer h=new Integer(3635);
	System.out.println(h);
	
	Float i=3f;
	System.out.println(i);
	
	Float j=3.147e+2f;
	System.out.println(j);
	
	Float k = new Float(3f);
	System.out.println(k);
	
	Long l=(long)123;
	System.out.println(l);
	
	Long m=new Long(123L);
	System.out.println(m);
	
	Double n=(double)123;
	Double o=123.4;
	System.out.println(n);
	System.out.println(o);
	
	Double p = new Double(123.4);
	System.out.println(p);
	
	Boolean q=true;
	System.out.println(q);
	
	Boolean r=new Boolean(false);
	System.out.println(r);
	
	
	
}
}
