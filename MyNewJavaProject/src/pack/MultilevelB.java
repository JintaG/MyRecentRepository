package pack;

public class MultilevelB extends MultilevelA {
    int bb=20;
    public void printB()
    {
    	System.out.println("Class B");
    }
	public static void main(String[] args) {
		MultilevelB b=new MultilevelB();
		b.printA();
		b.printB();
		System.out.println(b.a);
		System.out.println(b.bb);

	}

}
