package Assignment;

public class AddDiv extends AddNum {
	public void result()
	{
		if(sum%10==0)
		{
			System.out.println("Sum is divisible by 10");
		}
		else
		{
			System.out.println("Sum is not divisible by 10");
		}
		}
	public void display()
	{
	super.result();
	result();
	}

	public static void main(String[] args) {
		AddDiv e=new AddDiv();
		e.display();	
	}

}
