package Assignment;

public class EmpSalB extends EmpSalA {
	double hra;
	double pf;
	public void printB()
	{
        hra=0.05*basicPay;
		pf=0.20*basicPay;
		System.out.println("HRA :"+hra);
		System.out.println("PF :"+pf);
		
	}

	public static void main(String[] args) {
		EmpSalB g=new EmpSalB();
		g.printA();
		g.printB();
		
	}

}
