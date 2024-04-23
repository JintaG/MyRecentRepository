package pack;

public class HierarC extends HierarA {
    int c=10;
    public void printC()
    {
    	System.out.println("Class C");
    }
	public static void main(String[] args) {
		HierarC gc=new HierarC();
		gc.printA();
		gc.printC();
		System.out.println(gc.a);
		System.out.println(gc.c);

	}

}
