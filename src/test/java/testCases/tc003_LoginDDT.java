package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;

public class tc003_LoginDDT extends BaseClass{
	
	/* Data is valid - login success - test pass- logout
	 * Data is valid - login failed - test fail
	 * 
	 * Data is invalid - login success - test fail
	 * Data is invalid - login failed - test pass
	 */
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class, groups="datadriven")

	public void verify_loginDDT(String email, String pwd, String exp)
	{
	logger.info("*********starting TC_003_LoginDDT");
	try {
		
	
	HomePage hp = new HomePage(driver);
	hp.clickOnMyAccount();
	hp.clickLogin();
	
	LoginPage lp = new LoginPage(driver);
	lp.enterEmailAddress(email);
	lp.enterPassword(pwd);
	lp.clickOnLoginButton();
	
	
	MyAccountPage macc = new MyAccountPage(driver);
	boolean target = macc.isMyAccountPage();
	
	if(exp.equalsIgnoreCase("Valid"))
	{
		if(target==true)
		{
			macc.clicklogoutButton();
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
if(exp.equalsIgnoreCase("Invallid"))
{
	if(target==true)
	{
		macc.clicklogoutButton();
		Assert.assertTrue(false);
		
	}
	else
	{
		Assert.assertTrue(true);
	}
}	

	} catch(Exception e)
{
	Assert.fail();
}

logger.info("***Finished logout page************");
	}
}
