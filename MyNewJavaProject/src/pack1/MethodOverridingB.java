package pack1;

public class MethodOverridingB extends MethodOverridingA {
	@Override
	public void run()
	{
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		MethodOverridingB b=new MethodOverridingB();
		b.run();

	}

}
