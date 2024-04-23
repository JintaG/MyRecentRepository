package pack;

public class ParamToDef {
	public ParamToDef()
	{
		System.out.println("Default constructor");
	}

	public ParamToDef(int a) {
		this();
		System.out.println("Param constructor");
		System.out.println(a);
	}

	public static void main(String[] args) {
		ParamToDef c=new ParamToDef(10);
	}

}
