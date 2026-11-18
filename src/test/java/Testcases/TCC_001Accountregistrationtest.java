package Testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Accountregistrationpage;
import PageObject.Homepage;

import Testbase.Baseclassdemo;

public class TCC_001Accountregistrationtest extends Baseclassdemo {
	@Test
	public void verify_account_registration()
	{
		
		logger.info("This is a debug log message");
		try
		{
			Homepage hp = new Homepage(driver);
			hp.ClickMyaccount();
		logger.info("Clicked on MyAccount Link..");
		hp.ClickRegister();
		logger.info("Clicked on Register Link..");
		Accountregistrationpage reg = new Accountregistrationpage(driver);
		logger.info("Providing customer details...");
		reg.setFirstName(randomeString().toUpperCase());
		reg.setLastName(randomeString().toUpperCase());
		reg.setEmail(randomeString()+"@gmail.com");
		reg.setTelephone(randomeNumber());
		String password=randomAlphaNumeric();
		reg.setPassword(password);
		reg.setConfirmPassword(password);
		reg.setPrivacyPolicy();
		reg.clickContinue();
		logger.info("Validating expected message..");
		String  confmsg =reg.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!", "Confirmation message mismatch");
		logger.info("Test passed");
		}
		catch (Exception e)
		{
			logger.error("Test failed"+e.getMessage());
			Assert.fail("Testfailed"+e.getMessage());			
		}
		finally
		{
			
			logger.info("Finished AccountregistrationTest");
		}
	}
}
		
	

	