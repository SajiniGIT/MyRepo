package ncTestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_getOptions {

	public static void main(String[] args) throws Exception {
		

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");

		driver.findElement(By.tagName("button")).click();

		driver.findElement(By.xpath("(//p[contains(text(),'Sales')])[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(),'Shopping carts')]")).click();
		Thread.sleep(3000);

		WebElement BillingCountry = driver.findElement(By.id("BillingCountryId"));
		Select selection = new Select(BillingCountry);
		
		List<WebElement> allOptions = selection.getOptions(); 
		
		System.out.println(allOptions.size());
		
		driver.quit();
		
		
		
	}

}
