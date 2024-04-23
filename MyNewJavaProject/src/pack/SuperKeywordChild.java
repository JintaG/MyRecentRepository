package pack;

public class SuperKeywordChild extends SuperKeywordParent {
String color="Black";
public void display()
{
	System.out.println(color);
	System.out.println(super.color);
	System.out.println(a);
}
	public static void main(String[] args) {
		SuperKeywordChild c=new SuperKeywordChild();
		c.display();

	}

}
