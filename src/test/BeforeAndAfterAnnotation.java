package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterAnnotation {

	@BeforeClass
	public void beforeClass() {
		System.out.println("before executing all the methode First");
	}
	@BeforeTest
	public void getLogin() {
		System.out.println("Login sucessfully");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Hit the URL");
	}
	@Test(groups="Smoke")
	public void getNavigateTo() {
		System.out.println("Navigatting to Payment");
	}
	@AfterMethod
	public void afterMethode() {
		System.out.println("Close the URL");
	}
	@Test
	public void clickOnHome() {
		System.out.println("Click on Payment Method");
	}
	@AfterTest
	public void getLogout() {
		System.out.println("Logout successfully");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("before executing all the methode Last");
	}
}
