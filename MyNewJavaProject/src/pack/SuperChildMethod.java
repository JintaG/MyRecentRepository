package pack;



public class SuperChildMethod extends SuperParentMethod {
	
	public void run()
	{
		System.out.println("Child class");
	}
	public void display()
	{
		
		run();
		super.run();
	}

	public static void main(String[] args) {
		SuperChildMethod d=new SuperChildMethod();
		d.display();

	}

}
