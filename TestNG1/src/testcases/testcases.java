package testcases;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcases {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println(" before suite   Cases");

	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println(" after suite   Cases");

	}
	
	@AfterTest

	public void aftertest()
	{
		System.out.println(" After  Test Cases");
	}
	
	@BeforeTest

	public void beforetest()
	{
		System.out.println(" Before  Test Cases");
	}
	
	@AfterMethod

	public void aftermethod()
	{
		System.out.println(" =====After method  Test Cases====");
	}
	@BeforeMethod

	public void beforemethod()
	{
		System.out.println(" =====before method  Test Cases====");
	}
	
	
	
@Test(priority=2, dependsOnMethods={"loginTest"})
	
	public void changePassword()
	{
		System.out.println(" Change Password Test Cases");
	}
	@Test(priority=1)
	
	public void loginTest()
	{
		//throw new SkipException("Any reason");

		System.out.println(" Login Test Cases");
	}

@Test(priority=3, dependsOnMethods={"loginTest", "changePassword"})

public void Logout()
{
	System.out.println(" Logout Test Cases");
}

}
