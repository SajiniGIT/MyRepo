package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ActionMethods1 {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");
		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");

		driver.findElement(By.id("Email")).clear();

		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.name("Password")).clear();

		driver.findElement(By.name("Password")).sendKeys("admin");

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		driver.quit();

	}

}
