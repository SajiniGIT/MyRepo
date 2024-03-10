package ncTestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_ActionsClass_MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Baby & Kids')]"))).perform();
		
		Thread.sleep(5000);
		
		action.moveToElement(driver.findElement(By.linkText("Educational Toys"))).perform();
		
		Thread.sleep(5000);
		
		action.click().perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[contains(text(),'LEGO')]")).click();
		
		boolean Val = driver.findElement(By.xpath("//div[contains(text(),'LEGO')]")).isEnabled();
		
		System.out.println("Is LEGO checkbox got enabled? " + Val);
		
		Thread.sleep(5000);
		
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Price -- High to Low')]"))).perform();
		
		action.click().perform();
		
		Thread.sleep(5000);
		
		action.moveToElement(driver.findElement(By.xpath("//img[@alt='LEGO Technic Heavy-Duty Tow Truck (2017 Blocks) Model Building Kit']"))).perform();
		
		action.click().perform();
		
		Thread.sleep(5000);
		
		boolean Val2 = driver.findElement(By.xpath("//img[@alt='LEGO Technic Heavy-Duty Tow Truck (2017 Blocks) Model Building Kit']")).isDisplayed();
		
		System.out.println("is LEGO Technic Heavy-Duty Tow Truck (2017 Blocks) Model Building Kit displayed? " + Val2);
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
