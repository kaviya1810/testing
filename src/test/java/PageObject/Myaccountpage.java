package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccountpage   extends Basepage {
	public Myaccountpage(WebDriver driver) {

		super(driver);

	}
 
	@FindBy(xpath = "//h2[text()='My Account']") // MyAccount Page heading

	WebElement msgHeading;

public boolean isMyAccountPageExists()   // MyAccount Page heading display status

	{

		try {

			return (msgHeading.isDisplayed());

		} catch (Exception e) {

			return (false);

		}

	}

@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
WebElement lnkLogout;

public void clickLogout() {
	lnkLogout.click();
}
}

	





