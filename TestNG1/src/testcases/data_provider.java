package testcases;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class data_provider {
	
	
	@DataProvider(name="logindataprovider")
	public static Object[][] getdata()
	{
		Object[][] data= new Object[4][4];
		
		data[0][0]="u1";
		data[0][1]="p1";
		data[0][2]="e1";
		data[0][3]="b1";
		
		data[1][0]="u2";
		data[1][1]="p2";
		data[1][2]="e2";
		data[1][3]="b2";
		
		data[2][0]="u3";
		data[2][1]="p3";
		data[2][2]="e3";
		data[2][3]="b3";
		
		
		return data;
	}
	@DataProvider(name="sampledataprovider")
	public static Object[][] get(Method m)
	{
		Object[][] data= null;
		
		if(m.getName().equalsIgnoreCase("testA"))
		{
			data= new Object[2][2];
			data[0][0]="u1";
			data[0][1]="p1";
			
			
			data[1][0]="u2";
			data[1][1]="p2";
		}else if(m.getName().equalsIgnoreCase("testB"))
		{
			data= new Object[3][4];
			data[0][0]="u1";
			data[0][1]="p1";
			data[0][2]="e1";
			data[0][3]="b1";
			
			data[1][0]="u2";
			data[1][1]="p2";
			data[1][2]="e2";
			data[1][3]="b2";
			
			data[2][0]="u3";
			data[2][1]="p3";
			data[2][2]="e3";
			data[2][3]="b3";
		}
		
		
		
		return data;
	}

}
