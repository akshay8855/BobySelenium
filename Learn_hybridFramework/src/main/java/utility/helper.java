package utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;


public class helper {

	
	public void switchToIFrame(WebDriver driver, int index){
		driver.switchTo().frame(index);
	}
		public void switchToIFrame(WebDriver driver, String name){
			driver.switchTo().frame(name);
		}	
			public void switchToIFrame(String id ,WebDriver driver){
				driver.switchTo().frame(id);
			}		
				public void switchToIFrame(WebElement ele,WebDriver driver){
					driver.switchTo().frame(ele);
			}
				public void switchToIFrame(WebDriver driver){
					//driver.switchTo().defoultcontent();
			driver.switchTo().parentFrame();
				}
	//capture screenshot 
				
				public void captureScreenshots(WebDriver driver, String screenshotname) {
					
					try {
						File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						
						FileHandler.copy(scrfile, new File (".//screenshot//crmpro_"+getCurrentDateTime()+"_"+ screenshotname + ".png"));
						System.out.println(" screen shot is not captured..");
					}catch (Exception e) {
						e.printStackTrace();
						
						
					}
				}
				
				public static String getCurrentDateTime() {
					DateFormat customFormat = new SimpleDateFormat("mm_dd_yyyy_HH_MM_SS");
					 
					Date currentDate = new Date();
					
					return customFormat.format(currentDate);
					
				}
					
				}