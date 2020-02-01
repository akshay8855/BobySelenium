package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class homepage {
	WebDriver driver;
	@FindBy (xpath="//a[text()"='contacts]')
	
	WebElement contactsLink;
	
	@FindBy (xpath="//a[text()"='contacts]')
	
	WebElement contactsLink;
	
	@FindBy (xpath="//a[text()"='contacts]')
	
	WebElement contactsLink1;
	
	
	@FindBy (xpath="//a[text()"='contacts]')
	
	WebElement contactsLink11;
	
public homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
public String verifyloggedUserName() {
	return loggedUserName.getText();
} 
public new ContactPage navigateToNewContactPage{
helper .mousehoverAndlickActions(driver,contactslist,newcontactslink);
return new NewContactPage(driver);
}