package pack;

public class FinalMethodB extends FinalMethodA {
	public void display() //error will appear as we can't override the method in parent class to child class if we use final keyword in method of parent class 
	{
		System.out.println("Child class");
	}


	public static void main(String[] args) {
		FinalMethodB e=new FinalMethodB();
		e.display();
		e.run();
	}

}
