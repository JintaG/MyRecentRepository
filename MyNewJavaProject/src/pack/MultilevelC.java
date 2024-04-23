package pack;

public class MultilevelC extends MultilevelB {
	int cc=40;
	public void printC()
	{
		System.out.println("Class C");
	}

	public static void main(String[] args) {
		MultilevelC c=new MultilevelC();
		c.printA();
		c.printB();
		c.printC();
		System.out.println(c.a);
		System.out.println(c.bb);
		System.out.println(c.cc);

	}

}
