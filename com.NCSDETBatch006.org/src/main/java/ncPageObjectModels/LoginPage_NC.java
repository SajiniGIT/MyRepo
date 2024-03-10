package ncPageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_NC { // Rule-1 create a class for a webpage

	WebDriver driver;

	public LoginPage_NC(WebDriver d) { // Rule-4 create constructor for each page class with WebDriver object as
		this.driver = d; // argumentthis.driver = d;
	}

	// Rule-2 provide the web elements information

	By email = By.id("Email");
	By pswd = By.name("Password");
	By loginBtn = By.tagName("button");

	// Rule-3 Create methods for each web elements based on element type

	public void enterEmailField() {
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("admin@yourStore.com");
	}

	public void enterPasswordField() {
		driver.findElement(pswd).clear();
		driver.findElement(pswd).sendKeys("admin");
	}

	public void clickOnLogin() {
		driver.findElement(loginBtn).click();
	}

}
