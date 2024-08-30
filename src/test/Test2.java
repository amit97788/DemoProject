package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

	@Parameters({"URL","UserName"})
	@Test
	public void myHomeLoan(String str,String userName)
	{
		System.out.println("My Home Loan:-100000");
		System.out.println(str);
		System.out.println(userName);
	}
	@Test(groups="Smoke")
	public void myCarLoan()
	{
		System.out.println("My Car Loan:- 100000");
	}
	
}
