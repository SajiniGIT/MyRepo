package ncPageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrdersPage_NC {
	WebDriver driver;

	public OrdersPage_NC(WebDriver d) {
		this.driver = d;
	}

	By productNameField = By.id("search-product-name");
	By searchBtn = By.id("search-orders");

	public void enterProductName() {
		driver.findElement(productNameField).sendKeys("Electronics");
	}

	public void clickOnSearchButton() {
		driver.findElement(searchBtn).click();
		//boolean val2 = driver.findElement(searchBtn).isDisplayed();
		


	}

}
