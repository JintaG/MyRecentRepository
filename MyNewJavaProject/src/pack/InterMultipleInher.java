package pack;

public class InterMultipleInher implements Printing,Showable 
{
	@Override
	public void run()
	{
		System.out.println("This is run Method");
	}

	public static void main(String[] args) {
		Printing p=new InterMultipleInher();
		p.run();
		Showable s=new InterMultipleInher();
		s.run();

	}

}
