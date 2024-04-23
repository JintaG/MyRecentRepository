package pack;

public class StringMethods {
	
	public static void main(String args[]) {
		String s="Hello World";
		String s1="Java World";
		String s2="hello World";
		String a="Java Programming";
		int len=s.length();
		System.out.println(len);
		char c=s.charAt(6);
		System.out.println(c);
		String concat=s.concat(s1);
		System.out.println(concat);
		boolean eq=s.equals(s2);
		System.out.println(eq);
		boolean result=s.equalsIgnoreCase(s2);
		System.out.println(result);
		String lower=s.toLowerCase();
		System.out.println(lower);
		String upper=s.toUpperCase();
		System.out.println(upper);
		String replaced=s.replace('H','M');
		System.out.println(replaced);
		a.replace('J','M');
		System.out.println(a);
		StringBuffer sb=new StringBuffer("Java sample pgm");
		sb.reverse();
		System.out.println("String Buffer:"+sb);
		StringBuilder ss=new StringBuilder("My Java World");
		ss.reverse();
		System.out.println("String Builder:"+ss);
		
	}

}
