package ncTestScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ActionMethods3 {

	public static void main(String[] args) throws Exception{
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='Password']")).clear();
		
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
			
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(), 'Content')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[contains(text(), ' Forums')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='EditForumGroup/1']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class= 'form-control text-box single-line']")).clear();
		Thread.sleep(2000);
		//input[@class= 'form-control text-box single-line']
		driver.findElement(By.xpath("//input[@class= 'form-control text-box single-line']")).sendKeys("Regular");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name= 'save']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[contains(text(), 'Help')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[contains(text(), ' Community forums')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[contains(text(), ' Premium support services')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[contains(text(), ' Solution partners')]")).click();
		Thread.sleep(2000);
		
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		Thread.sleep(2000);
		
		driver.close();
	
		driver.quit();

	}

}
