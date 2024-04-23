package pack;

public class AccessModifierWC {
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	private void printA()
	{
		System.out.println("Private Method");
	}
    void printB()
    {
    	System.out.println("Default Method");
    }
    protected void printC()
    {
    	System.out.println("Protected Method");
    }
    public void printD()
    {
    	System.out.println("Public Method");
    }
	public static void main(String[] args) {
		AccessModifierWC wc=new AccessModifierWC();
		System.out.println(wc.a);
		System.out.println(wc.b);
		System.out.println(wc.c);
		System.out.println(wc.d);
		wc.printA();
		wc.printB();
		wc.printC();
		wc.printD();
	}

}
