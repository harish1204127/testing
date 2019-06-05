package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class logintest {

	@Test(dataProviderClass=data_provider.class, dataProvider="sampledataprovider")
	public void testA(String username, String password)
	{
		
	}
	
	@Test(dataProviderClass=data_provider.class, dataProvider="sampledataprovider")
	public void testB(String username, String password, String Express, String Browser)
	{
		
	}
	
	
	
}
