package Assignment;

public class PalinStr {

	public static void main(String[] args) {
		String s1="Java Malayalam";
		StringBuilder s2=new StringBuilder(s1);
		s2.reverse();
		if(s1.equals(s2.toString()))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not a Palindrome String");
		}

	}

}
