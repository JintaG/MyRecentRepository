package pack;

public class ThisWithMethod {
	public void show()
	{
		System.out.println("Inside the show method");
	}
	public void run()
	{
		this.show();
	}

	public static void main(String[] args) {
		ThisWithMethod in=new ThisWithMethod();
		in.run();

	}

}
