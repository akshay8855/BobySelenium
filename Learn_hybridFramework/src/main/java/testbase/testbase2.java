package testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import utility.BrowserFactory;
import utility.configdata;

public class testbase2 {
	public BrowserFactory browserFactory;
	@BeforeSuite
	public void init() {
		new configdata();
		browserFactory=new BrowserFactory();
		
		
		
	}
	@AfterMethod
	public void tearDown() {
		browserFactory.quitBrowser();
		
	}

}
