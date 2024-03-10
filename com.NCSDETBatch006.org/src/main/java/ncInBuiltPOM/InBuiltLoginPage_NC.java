package ncInBuiltPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class InBuiltLoginPage_NC {

	WebDriver driver;

	public InBuiltLoginPage_NC(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(id = "Email")
	WebElement email;

	@CacheLookup
	@FindAll({ @FindBy(id = "Password"), @FindBy(name = "Password") })
	WebElement pws;

	@CacheLookup
	@FindBys({ @FindBy(className = "buttons"), @FindBy(tagName = "button") })
	WebElement loginBtn;

	public void enterEmailField() {
		email.clear();
		email.sendKeys("admin@yourstore.com");
	}

	public void enterPasswordField() {
		pws.clear();
		pws.sendKeys("admin");
	}

	public void clickOnLoginBtn() {
		loginBtn.click();
	}

}
