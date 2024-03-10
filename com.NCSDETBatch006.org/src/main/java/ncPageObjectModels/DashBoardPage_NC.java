package ncPageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage_NC {
	WebDriver driver;

	public DashBoardPage_NC(WebDriver d) {
		this.driver = d;
	}

	By dashboard = By.xpath("//h1[contains(text(), 'Dashboard')]");

	public void dashBoardVerification() {

		boolean val = driver.findElement(dashboard).isDisplayed();
		if (val == true) {
			System.out.println("Login Success");
		} else {
			System.out.println("Login Failed");
		}
	}
}
