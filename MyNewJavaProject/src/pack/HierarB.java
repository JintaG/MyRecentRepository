package pack;

public class HierarB extends HierarA {
    int b=10;
    public void printB()
    {
    	System.out.println("Class B");
    }
	public static void main(String[] args) {
		HierarB bb=new HierarB();
		bb.printB();
		bb.printA();
		System.out.println(bb.a);
		System.out.println(bb.b);

	}

}
