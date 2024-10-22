package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class tc002_LoginTest extends BaseClass{
	
	
	
	
	@Test(groups={"Sanity","Master"})
	public void verify_login()
	{
	
		logger.info("***** starting TC_002_LoginTest********");
		
		
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickOnMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.enterEmailAddress(p.getProperty("email"));
		lp.enterPassword(p.getProperty("password"));
		lp.clickOnLoginButton();
		
		MyAccountPage macc = new MyAccountPage(driver);
		boolean target = macc.isMyAccountPage();
		
		Assert.assertTrue(target);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("********Finished TC_002_LoginTest******");
		
		
	    
		
		
	
	
	
	}	

}
