package pack1;

public class EncapsulationPgm1 {
	private int rollNo;
	private String name;
	public void setDetails(int rollno,String n)
	{
	rollNo=rollno;
	name=n;
	}
	public void getDetails()
	{
		System.out.println("RollNo is:"+rollNo);
		System.out.println("Name is:"+name);
		
	}

	public static void main(String[] args) {
	

	}

}
