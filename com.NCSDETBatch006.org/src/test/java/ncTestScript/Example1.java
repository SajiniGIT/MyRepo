package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws Exception
	
	{
                
		ChromeDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");
		
		
		System.out.println("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");
		
		Thread.sleep(5000);
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(5000);
		
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(5000);
		
		driver.findElement(By.name("Password")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("Password")).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
	}

}
