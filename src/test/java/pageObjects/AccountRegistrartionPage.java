package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrartionPage extends BasePage{
	
	public AccountRegistrartionPage (WebDriver driver)
	   {
		   super(driver);
		   
	   }
	
	@FindBy(id="input-firstname")
	WebElement firstNameField;
	@FindBy(id="input-lastname")
	WebElement lastNameField;
	@FindBy(xpath="//input[@type='email']")
	WebElement emailField;
	@FindBy(id="input-telephone")
	WebElement telephoneField;
	@FindBy(id="input-password")
	WebElement passwordField;
	@FindBy(id="input-confirm")
	WebElement confirmField;
	@FindBy(xpath="//input[@name='agree']")
	WebElement agreeButton;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement contiuneButton;
	
	
	public void enterFirstName(String firstnameText) {
		firstNameField.sendKeys(firstnameText);
	}
	
	public void enterLastName(String lastNameText)
	{
		lastNameField.sendKeys(lastNameText);
	}
	public void enteremailField(String emailText)
	{
		emailField.sendKeys(emailText);
	}
	public void entertelephoneField(String telephonetext)
	{
		emailField.sendKeys(telephonetext);
	}
	public void passwordtextField(String passwordText)
	{
		emailField.sendKeys(passwordText);
	}
	
	public void confirmField(String confirmtext)
	{
		emailField.sendKeys(confirmtext);
	}

   public void clickOnAgreeButton() {
	   agreeButton.click();
   }
   
   public void clickOnContiuneButton() {
	   contiuneButton.click();
   }

}
