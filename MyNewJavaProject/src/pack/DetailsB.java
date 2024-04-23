package pack;

public class DetailsB extends DetailsA //error as we can't extend it
{
	public void student2()
	{
		System.out.println("Child class");
		
	}

	public static void main(String[] args) {
		DetailsB g=new DetailsB();
		g.student1();
		g.student2();
		

	}

}
