/**
 * 
 */
package pack;

/**
 * 
 */
public class ThisWithVar {
	int rollNo;
	String name;
	public ThisWithVar(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	public static void main(String[] args) {
		ThisWithVar c=new ThisWithVar(10,"Java");
		System.out.println(c.rollNo);
		System.out.println(c.name);	
	}

}
