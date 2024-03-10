package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_Select1 {

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
		Select selection = new Select(BillingCountry);
	
		selection.selectByVisibleText("United States");
		Thread.sleep(2000);
		
		selection.selectByVisibleText("Canada");
		Thread.sleep(2000);
		
		selection.selectByVisibleText("Germany");
		Thread.sleep(3000);
		
		selection.selectByVisibleText("India");
		Thread.sleep(3000);
		
		selection.selectByVisibleText("Singapore");
		Thread.sleep(3000);
		
		selection.selectByVisibleText("United Kingdom");
		Thread.sleep(3000);
		
		driver.quit();

	}

}
