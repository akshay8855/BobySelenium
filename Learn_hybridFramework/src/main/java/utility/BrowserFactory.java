package utility;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import pages.loginpage;

public class BrowserFactory {

	 public	static WebDriver driver; 
	 public static loginpage page;
	 public static configdata config;
		public static WebDriver browserSetup(String bname)
		
		{
			if(bname.equals("Crome")){
				System.setProperty("Webdrive.Crome.Driver","C:\\Users\\admin\\eclipse-workspace\\maven1\\drivers");
				driver=new ChromeDriver();
				
			}
			else if (bname.contentEquals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\maven1\\drivers");
			driver=new ChromeDriver();
			
		}
		else if (bname.equals("ie")) {
			System.setProperty("webdriver.ie.driver","C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\maven1\\\\drivers\");"));
			driver=new InternetExplorerDriver();
			
		}
		else {
			System.out.println("browser name is not matching");
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		return driver;
		}
		
}
