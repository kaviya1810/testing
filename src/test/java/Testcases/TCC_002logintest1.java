package Testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Homepage;
import PageObject.Loginpage;
import PageObject.Myaccountpage;

import Testbase.Baseclassdemo;

public class TCC_002logintest1 {
	public class TC_002_logintest extends  Baseclassdemo  {
		@Test

		public void verify_login()

		{

			logger.info("**** Starting TC_002_LoginTest  ****");

			logger.debug("capturing application debug logs....");

			try

			{

			//Home page

			Homepage hp=new Homepage(driver);

			hp.ClickMyaccount();

			logger.info("clicked on myaccount link on the home page..");

			hp.clickLogin();

			logger.info("clicked on login link under myaccount..");

			//Login page

			Loginpage lp=new Loginpage(driver);

			logger.info("Entering valid email and password..");

			lp.setEmail(p.getProperty("email"));
			//lp.setEmail("kaviya394@gmail.com");

		lp.setPassword(p.getProperty("password"));
		//lp.setPassword("kaviya@1910");

			lp.clickLogin(); //Login button

			logger.info("clicked on ligin button..");
	



	//My Account Page

			 Myaccountpage macc = new  Myaccountpage(driver);

			boolean targetPage=macc.isMyAccountPageExists();

			Assert.assertEquals(targetPage, true,"Login failed");

			}

			catch(Exception e)
			{
			    Assert.fail("Login test failed due to: " + e.getMessage(), e);
			}
			logger.info("**** Finished TC_002_LoginTest  ****");

		

		}
	}
}


	





