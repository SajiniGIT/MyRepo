package ncTestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_ActionsClass_ClicknHold {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		
		driver.get("https://jqueryui.com/draggable/");
		
	    Thread.sleep(5000);
	    
	    //iframe existed 
	    driver.switchTo().frame(0);
	    
	    Thread.sleep(5000);
	    
	    WebElement ele = driver.findElement(By.id("draggable"));
		
	    Thread.sleep(3000);
	    
		Actions action = new Actions(driver);
		
		action.moveToElement(ele).perform();
		
		action.clickAndHold().perform();
		
		Thread.sleep(3000);
		
		//action.release().perform();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
