package pack;

public class StudentDetails {
	int rollNo;
	String name;
	
	public StudentDetails(int rl,String n)
	{
	rollNo=rl;
	name=n;
	
	
	}
	public void display()
	{
	System.out.println("RollNo is:"+rollNo);
	System.out.println("Name is:"+name);
	}
	

	public static void main(String[] args) {
		StudentDetails s1=new StudentDetails(15,"Jain");
		s1.display();
		StudentDetails s2=new StudentDetails(10,"Ann");
		s2.display();
	}

}
