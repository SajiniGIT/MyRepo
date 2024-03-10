package ncPageObjectModels;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbstractComponents_NC {

	WebDriver driver;

	public AbstractComponents_NC(WebDriver d) {
		this.driver = d;
	}

	By sales = By.xpath("(//p[contains(text(), 'Sales')])[1]");
	By orders = By.xpath("(//p[contains(text(), ' Orders')])[1]");
	By Catalog = By.xpath("(//p[contains(text(), 'Catalog')])[1]");
	By Categories = By.xpath("(//p[contains(text(), 'Categories')])[1]");
	By logout = By.linkText("Logout");

	public void clickOnSales() {
		driver.findElement(sales).click();
	}

	public void clickOnOrders() {
		driver.findElement(orders).click();
	}

	public void clickOnCatalog() {
		driver.findElement(Catalog).click();
	}

	public void clickOnCategory() {
		driver.findElement(Categories).click();
	}

	public void doLogout() {
		driver.findElement(logout).click();
	}

	public void landingPageSetUp() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	public void tearDown() {
		driver.quit();
	}

}
