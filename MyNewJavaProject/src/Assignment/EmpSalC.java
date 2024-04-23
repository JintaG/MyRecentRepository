package Assignment;

public class EmpSalC extends EmpSalB {

	public void printC()
	{
		double totalSal=basicPay+hra-pf-deduction+bonus;
		System.out.println("Total salary :"+totalSal);
	}

	public static void main(String[] args) {
		EmpSalC d=new EmpSalC();
		d.printA();
		d.printB();
		d.printC();
		

	}

}
