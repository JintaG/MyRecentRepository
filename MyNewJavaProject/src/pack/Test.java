package pack;

public class Test implements Printable {
	@Override
	public void run()
	{
		System.out.println("Run method");
	}

	public static void main(String[] args) {
		Printable p=new Test();
		p.run();
		Test t=new Test();
		t.run();

	}

}
