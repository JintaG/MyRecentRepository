package pack;

public class ThisWithConstructorDefToParam {
	public ThisWithConstructorDefToParam()
	{
		this(23);
		System.out.println("Default constructor");
	}
    public ThisWithConstructorDefToParam(int a)
    {
    	System.out.println("Param constructor");
    	System.out.println(a);
    }
	public static void main(String[] args) 
	{
		ThisWithConstructorDefToParam c=new ThisWithConstructorDefToParam();
	}

}
