package ncTestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_PageScrollOperation {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		
		driver.get("https://www.tutorialspoint.com/index.htm");
		
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		
		//action.sendKeys(Keys.DOWN).build().perform();
		
		action.sendKeys(Keys.DOWN).scrollToElement(driver.findElement(By.xpath("//h2[contains(text(), 'Most Popular')]"))).perform();
		
		Thread.sleep(5000);
		
		WebElement Ele = driver.findElement(By.xpath("//h2[contains(text(), 'Most Popular')]"));
		
		Thread.sleep(5000);
		
		String text1 = Ele.getText();
		
		Thread.sleep(5000);
		
		System.out.println(text1);
		
		Thread.sleep(5000);
	
		//action.sendKeys(Keys.UP).build().perform();
		
		//action.sendKeys(Keys.UP).scrollToElement(driver.findElement(By.xpath("//h2[contains(text(), 'Certifications')]"))).perform();
		
		Thread.sleep(5000);
		
		WebElement Ele2 = driver.findElement(By.xpath("//h2[contains(text(), 'Certifications')]"));
		
		action.sendKeys(Ele2, Keys.UP).perform();
		
		Thread.sleep(5000);
		
		String text2 = Ele2.getText();
		
		Thread.sleep(5000);
		
		System.out.println(text2);
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
