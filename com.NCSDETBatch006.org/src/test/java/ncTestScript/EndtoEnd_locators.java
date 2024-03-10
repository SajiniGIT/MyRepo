package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEnd_locators {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='Email']")).clear();

		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@name='Password']")).clear();

		driver.findElement(By.xpath("//*[@name='Password']")).sendKeys("admin");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='checkbox' and @name='RememberMe']")).click();
		// driver.findElement(By.xpath("//input[@type='checkbox'][@name='RememberMe']")).click();

		driver.findElement(By.xpath("//button[@type='submit' or @class='button-1 login-button']")).click();
		// driver.findElement(By.xpath("(//button[@type='submit']) |
		// (button[@class='button-1 login-button'])")).click();

		driver.findElement(By.xpath("(//a[@href='#'])[8]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[text() = ' Discounts']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(),'Newsletter')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[starts-with(text(),' Affili')]")).click();
		Thread.sleep(3000);

		// driver.findElement(By.xpath("//h1[contains(text(),' Affiliates')]")).click();
		// Thread.sleep(3000);

		driver.findElement(By.xpath("//select[@name='affiliates-grid_length']|child::option[3]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='LoadOnlyWithOrders']|parent::div")).click();

		driver.findElement(By.xpath("(//button[@type='button'])[last()]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@aria-controls='OrdersCreatedFromUtc_dateview']|preceding-sibling::input"))
				.click();
		Thread.sleep(3000);
		//login page ancestor
		//driver.findElement(By.xpath("//input[@id='Email']/ancestor::form")).click();
		//driver.findElement(By.xpath("//div[@class='inputs'][1]|preceding-sibling::div[1]")).click();
		//driver.findElement(By.xpath("(//div[@class='form-fields'])[1]/following-sibling::div")).click();
		//driver.findElement(By.xpath("(//div[@class='inputs'])[1]/following-sibling::div[1]")).click();
		//driver.findElement(By.xpath("//input[@id='Email']/ancestor::form")).click();
		//driver.findElement(By.xpath("//form[@novalidate='novalidate']/descendant::div[5]")).click();
		//driver.findElement(By.xpath("//div[@class='form-fields']/descendant::input[2]")).click();
		//input[@id='Password']/preceding::div[2]
		//input[@id='Password']/following::div[2]
		////div[@class='page login-page']/self::div
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
