package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testbase.testbase;
import utility.BrowserFactory;
import utility.configdata;
import utility.exceldataprovider;

public class loginpage2 extends testbase {
	public loginpage  login;
	public WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		driver=BrowserFactory.browserSetup(configdata.getKey("browser"),configdata.getKey("qaUrl"));
		login = PageFactory.initElements(driver,loginpage.class);
	}
	@Test
	public void verifyLoginTest() {
		login.verifyLogin(exceldataprovider.getStringCellData(1,1,0),
				exceldataprovider.getStringCellData(1,1,1));
	}
}
		
		
		

				
		
		
		
	

	
