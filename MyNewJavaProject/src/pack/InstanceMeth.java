package pack;

public class InstanceMeth
	{
	static int a=10;
		public void add(int a,int b)
		{
			int sum=a+b;
			System.out.println("sum is:"+sum);
		}
	

	public static void main(String[] args) 
	{
		InstanceMeth c=new InstanceMeth();
		c.add(30,20);
		System.out.println(a);

	}

}
