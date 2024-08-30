package test;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(timeOut = 4000)
	public void hdfcEMI() {
		System.out.println("hdfc EMI:- 7600");
	}
    @Test(groups="Smoke")
    public void sbi1EMI() {
	    System.out.println("sbi1 EMI:- 2600");
    }
    @BeforeSuite
    public void beforeSuite() {
    	System.out.println("Executed First");
    }
    @Test(enabled = false)
    public void sbi2EMI() {
        System.out.println("sbi2 EMI:- 1042");
    }
    @Test(dependsOnMethods = "hdfcEMI")
    public void bantiMoney() {
	System.out.println("BantiMoney:- 6000");
    }
    @Test(dataProvider = "getData")
	public void runApplication(String data1 , String data2) {
		System.out.println(data1);
		System.out.println(data2);
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		data[0][0]="UserName";
		data[0][1]="Password";
		
		data[1][0]="Navigation";
		data[1][1]="Home";
		
		data[2][0]="Logout";
		data[2][1]="Confirm";
		
		return data;
	}
	
	@Test
	public void demo() {
		System.out.println("Listner is perfectly work");
		Assert.assertTrue(false);
	}

}
