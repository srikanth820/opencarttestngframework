package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
   

	
	public HomePage(WebDriver driver)
   {
	   super(driver);
	   
   }

	  @FindBy(xpath="//span[text()='My Account']")
	  WebElement myAccountDropMenu;
	
	  @FindBy(xpath="//a[text()='Register']")
	  WebElement registerOption;
	  
	  @FindBy(linkText="Login")
	  WebElement linkButton;


	  public void clickOnMyAccount () {
			myAccountDropMenu.click();
		}
		
	  public void selectRegisterOption() {
			registerOption.click();
		}
	  public void clickLogin() {
		  linkButton.click();
	  }
		





}
