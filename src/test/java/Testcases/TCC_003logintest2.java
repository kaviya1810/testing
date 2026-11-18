package Testcases;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Homepage;
import PageObject.Loginpage;
import PageObject.Myaccountpage;

import Testbase.Baseclassdemo;


public class TCC_003logintest2 extends Baseclassdemo  {
	@Test(dataProvider="LoginData",dataProviderClass=DataProvider.class)

static	public void verify_loginDDT(String email, String password, String exp)

	{

		logger.info("**** Starting TC_003_LoginDDT *****");

		try {

		//Home page

			Homepage hp=new Homepage(driver);

			hp.ClickMyaccount();

			hp.clickLogin(); //Login link under MyAccount

			//Login page

			Loginpage lp=new Loginpage(driver);

			lp.setEmail(email);
			

			lp.setPassword(password);
			
			lp.clickLogin(); //Login button

			//My Account Page

			Myaccountpage macc=new Myaccountpage(driver);

			boolean targetPage=macc.isMyAccountPageExists();

			if(exp.equalsIgnoreCase("Valid"))

			{

				if(targetPage==true)

				{

					macc.clickLogout();

					Assert.assertTrue(true);

				}

				else

				{

					Assert.assertTrue(false);

				}

			}

			if(exp.equalsIgnoreCase("Invalid"))

			{

				if(targetPage==true)

				{

					macc.clickLogout();

					Assert.assertTrue(false);

				}

				else

				{

					Assert.assertTrue(true);

				}

			}

		}

		catch(Exception e)

		{

			Assert.fail("An exception occurred: " + e.getMessage());

		}

		logger.info("**** Finished TC_003_LoginDDT *****");

	}

 

}
