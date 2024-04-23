package pack1;

public class AbstractPgm2 extends AbstractPgm1 
{
	@Override
	public void run() {
		System.out.println("Run Method");
		
	}

	public static void main(String[] args) {
		
		AbstractPgm2 c=new AbstractPgm2();
		c.run();
		c.show();
		AbstractPgm1 d=new AbstractPgm2();
		c.run();
		c.show();
	}

	

}
