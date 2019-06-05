package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertion {

	
	@Test
	public void asserttest()
	{
		SoftAssert softAssert = new SoftAssert();
		String x="abc";
		String y="xyz";
		//Assert.assertEquals(x, y);
		//Assert.assertTrue(2>1, "Pass");
		//Assert.assertTrue(isElementPresent("dgg"), "sdfs");
		System.out.println("A");
		softAssert.assertEquals(x, y);
		System.out.println("B");
		softAssert.assertAll();
	}

	
	
}
