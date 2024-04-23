package pack;

public class Variable {
	final int a=10;
	static int b=20;
	public void run()
	{
		//a=50; //appear error as we can't change final variable value
		b=70; //we can change the static variable value
		System.out.println("Final variable value is:"+a);
		System.out.println("Static variable value changed to:"+b);
	}

	public static void main(String[] args) 
	{
		Variable d=new Variable();
		d.run();

	}

}
