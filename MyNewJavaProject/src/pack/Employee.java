package pack;

public class Employee {
	int empid;
	String name;
	Address addr;
	public Employee(int empid,String name,Address addr)
	{
		this.empid=empid;
		this.name=name;
		this.addr=addr;
	}
public void display()
{
	System.out.println(empid);
	System.out.println(name);
	System.out.println(addr.city);
	System.out.println(addr.state);
	System.out.println(addr.country);
}
	public static void main(String[] args) {
		Address a1=new Address("TVM","Kerala","India");
		Employee e1=new Employee(101,"Jinta",a1);
		e1.display();
		
		Address a2=new Address("Thrissur","Kerala","India");
		Employee e2=new Employee(102,"Jain",a2);
		e2.display();

	}

}
