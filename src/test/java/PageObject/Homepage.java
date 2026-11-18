package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage  extends  Basepage {

public Homepage(WebDriver driver)
{
	super(driver);
}
@FindBy(xpath="//a[@title='My Account']//i")
WebElement lnkMyaccount;
@FindBy(xpath="//a[normalize-space()='Register']")
WebElement lnkRegister;
@FindBy(linkText = "Login")    
WebElement linkLogin;
public void clickLogin()   
{
	linkLogin.click();
}

public void ClickMyaccount()
{
lnkMyaccount.click();	
}
public void ClickRegister()
{
	lnkRegister.click();
}



}