package pack;

public class AccessModifierOutsideClass {
	public int e=990; 

	public static void main(String[] args) {
		AccessModifierWC l=new AccessModifierWC();
		System.out.println(l.b);
		System.out.println(l.c);
		System.out.println(l.d);
		l.printB();
		l.printC();
		l.printD();
     AccessModifierOutsideClass vv=new AccessModifierOutsideClass();
     System.out.println(vv.e);
	}

}
