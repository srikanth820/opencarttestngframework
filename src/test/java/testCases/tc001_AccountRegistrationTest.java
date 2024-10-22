package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrartionPage;
import pageObjects.HomePage;



public class tc001_AccountRegistrationTest extends BaseClass{
	
	

	@Test(groups={"Regression","Master"})
	public void verify_account_registration() {
		
	logger.info("******starting TC_001_AccountRegistartionTest ****");
		
     HomePage hp =new HomePage(driver);
     hp.clickOnMyAccount();
     logger.info("clicked on My Account");
     hp.selectRegisterOption();
     logger.info("clicked on Register");
     
     logger.info("...providing customer details....");
     AccountRegistrartionPage rp = new AccountRegistrartionPage(driver);
     rp.enterFirstName(randomeString().toUpperCase());
     rp.enterLastName(randomeString().toUpperCase());
     rp.enteremailField(randomeString()+"@gmail.com");
     rp.entertelephoneField("8077774000");
     rp.passwordtextField("@a123456");
     rp.confirmField("@a123456");
     rp.clickOnAgreeButton();
     rp.clickOnContiuneButton();
     
 
	logger.info("******finshid TC_001_AccountRegistartionTest ****");
	
	}
}
