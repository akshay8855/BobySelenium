package testbase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import utility.BrowserFactory;
import utility.ExcelDataProvider2;
import utility.configdata;
import utility.helper;

public class TasteBase3 {
	public configdata configDataProvider;
	public BrowserFactory browserFactory;
	public ExcelDataProvider2 excelDataProvider2;
    public utility.helper helper;
	@BeforeSuite
	
	public void init(){
		helper=new helper();
		excelDataProvider2=new ExcelDataProvider2();
	    configDataProvider=new configdata();
	    
	    browserFactory=new BrowserFactory();
	}
	@AfterMethod
	public void tearDown1() {
		BrowserFactory.quitBrowser();
	}

		
	    
		
				



}
