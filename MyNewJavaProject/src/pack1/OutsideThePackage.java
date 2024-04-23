package pack1;

import pack.AccessModifierOutsideClass;
import pack.AccessModifierWC;

public class OutsideThePackage {

	public static void main(String[] args) {
		AccessModifierWC b=new AccessModifierWC();
		System.out.println(b.d);
		b.printD();
		AccessModifierOutsideClass a=new AccessModifierOutsideClass();
		System.out.println(a.e);

	}

}
