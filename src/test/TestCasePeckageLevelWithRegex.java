package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestCasePeckageLevelWithRegex {

	@Test
	public void high1SchoolFriend() {
		System.out.println("Banti,Lipu......");
	}
	@Test(groups="Smoke")
	public void high2SchoolFriend() {
		System.out.println("Supdev,Sejpoda,Rana....");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Executed Last");
	}
	@Test
	public void plustwoFriend() {
		System.out.println("Chandan,Sanu,Sredhar....");
	}
	@Test
	public void engineeringFriend() {
		System.out.println("Guru,Chida,Bhabesh.....");
	}
}
