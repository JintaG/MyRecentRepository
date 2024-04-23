package pack1;

public class AbstractPgm3 extends AbstractPgm1 {
	@Override
	public void run() {
		System.out.println("Run Method 3");
		
	}

	public static void main(String[] args) {
		AbstractPgm3 b=new AbstractPgm3();
		b.run();
		b.show();
		AbstractPgm1 s=new AbstractPgm3();
		s.run();
		s.show();

	}

	

}
