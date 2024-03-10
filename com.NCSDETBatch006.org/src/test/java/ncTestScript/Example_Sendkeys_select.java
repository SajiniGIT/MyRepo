package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_Sendkeys_select {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//p[contains(text(),'Sales')])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[contains(text(),'Shopping carts')]")).click();
		Thread.sleep(3000);
		
		WebElement BillingCountry = driver.findElement(By.id("BillingCountryId"));
		
		BillingCountry.click();
		Thread.sleep(2000);
		
		BillingCountry.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		
		BillingCountry.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		
		BillingCountry.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		
		driver.quit();

	}

}
