package pack;

public class HierarD extends HierarA {
	int d=10;
	public void printD()
	{
		System.out.println("Class D");
	}

	public static void main(String[] args) {
		HierarD ss=new HierarD();
		ss.printA();
		ss.printD();
		System.out.println(ss.a);
		System.out.println(ss.d);

	}

}
