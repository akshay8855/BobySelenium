package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.loginpage;
import testbase.TasteBase3;
import utility.ExcelDataProvider2;
import utility.browserfactor;
import utility.configdata;

public class loginpagetest extends TasteBase3{
	public loginpage login;
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver=browserfactor.browserSetup(configdata.getKey("browser"),
	   configdata.getKey("qaUrl"));
		login=PageFactory.initElements(driver,loginpage.class);
	}
		@Test
		public void verifyLoginTest() {
			login.verifyLogin(ExcelDataProvider2.getStringCellData(1,1,0),
			ExcelDataProvider2.getStringCellData(1,1,1));
			helper.captureScreenshots(driver,"freecrm_login");
			
			
			
		}
		
		
		@Test(priority=1)
		public void verifyLoginPagetitleTest()
		{
			String actualTitle=login.verifyLoginPageTitle();
			System.out.println("actual title of login page is:"+actual title of login page );
					String expected
					
					
					
					
	    @Test(priority=2)
			
			
			
			WebElement username=WebElement driver.findElement(by.xpath(".//td[@align='left' and @class='headertext']"));
			String user=username.getText();
			
			System.out.println("logged in user name is :"+user);
			
			if(user.contains("Mayuri1")) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);

			}
			
			}

			
		}
	
	}
	

