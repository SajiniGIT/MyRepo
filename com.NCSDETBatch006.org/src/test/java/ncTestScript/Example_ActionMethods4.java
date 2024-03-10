package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ActionMethods4 {

	public static void main(String[] args) throws Exception {
		

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
		
		driver.findElement(By.id("RememberMe")).sendKeys(Keys.TAB, Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//p[contains(text(), 'System')])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[contains(text(), 'System info')]")).click();
		Thread.sleep(3000);
		
	    String textVal = driver.findElement(By.className("float-left")).getText();
		System.out.println(textVal);
		
		//String attriVal = driver.findElement(By.className("float-left")).getAttribute("className");
		//System.out.println(attriVal);
	
		String attrVal = driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).getAttribute("class");
		System.out.println(attrVal);
		
		driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click();
		Thread.sleep(3000);
		
		String tagVal = driver.findElement(By.xpath("//h2[contains(text(), 'Defaults for admin area')]")).getTagName();
		System.out.println(tagVal);
		
		driver.quit();
		
		}

}
