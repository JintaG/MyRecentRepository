package pack;

public class SingleB extends SingleA {
    int c=30;
    public void run2()
    {
    	System.out.println("Class B");
    }
	public static void main(String[] args) {
		SingleB b=new SingleB();
		b.run();
		b.run2();
		System.out.println(b.a);
		System.out.println(b.c);

	}

}
