package Assignment;

public class Address {
	String addr;
	Student stud; //entity reference
	public Address(String addr,Student stud)
	{
	this.addr=addr;
	this.stud=stud; 
	}
	public void display()
	{
		System.out.println("Name of the student:"+" "+(stud.name));
		//System.out.println(stud.name);
		System.out.println("Roll No:"+" "+(stud.rollNo));
		//System.out.println(stud.rollNo);
		System.out.println("Address:"+addr);
		//System.out.println(addr);
	}

	public static void main(String[] args) {
		Student s=new Student("Mariya",15);
		Address a=new Address("Thoppil House,Thrissur",s);
		a.display();
		

	}

}
