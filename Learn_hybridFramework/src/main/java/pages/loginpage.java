package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	@FindBy(name="username")
	WebElement User;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(xpath="//input[@type='submit]")
	WebElement loginBtn;
	public void verifyLogin(String un,String up) {
		User.sendKeys(un);
		pass.sendKeys(up);
		loginBtn.click();
		
	
	}

	}
	
