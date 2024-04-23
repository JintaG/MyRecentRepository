package pack;

public class SuperChildConstructor extends SuperParentConstructor {
	public SuperChildConstructor()
	{
		super();
		System.out.println("Child class constructor");
	}
	
	public static void main(String[] args) {
		SuperChildConstructor e=new SuperChildConstructor();
		

	}

}
