package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_XPath {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='Password']")).clear();
		
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
			
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		
		driver.quit();

	}

}
