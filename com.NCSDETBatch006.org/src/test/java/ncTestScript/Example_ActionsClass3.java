package ncTestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_ActionsClass3 {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		
		driver.get("https://demoqa.com/buttons");
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.id("rightClickBtn"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(ele).perform();
		
		Thread.sleep(3000);
		
		action.contextClick(ele).perform();
		
		Thread.sleep(3000);
		
		WebElement ele2 = driver.findElement(By.id("doubleClickBtn"));
		
		action.moveToElement(ele2).perform();
		
		Thread.sleep(3000);
		
		action.doubleClick().perform();
		
		Thread.sleep(3000);
	      
        WebElement ele3 = driver.findElement(By.xpath("(//button[contains(text(),'Click Me')])[3]"));
        
        action.moveToElement(ele3).perform();
        
        Thread.sleep(3000);
        
        action.click().perform();
        
        Thread.sleep(3000);
        
        driver.quit();

	}

}
