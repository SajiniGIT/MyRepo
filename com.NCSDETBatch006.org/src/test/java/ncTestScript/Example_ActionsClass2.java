package ncTestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_ActionsClass2 {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		

		driver.get("https://demo.automationtesting.in/Static.html");

		Thread.sleep(5000);

		WebElement source = driver.findElement(By.id("dragarea"));

		WebElement target = driver.findElement(By.id("droparea"));

		Actions action = new Actions(driver);

		action.dragAndDrop(source, target).perform();

		Thread.sleep(3000);

		WebElement source2 = driver.findElement(By.id("node"));
		
		action.dragAndDrop(source2, target).perform();
		
		WebElement source3 = driver.findElement(By.id("angular"));

		action.dragAndDrop(source3, target).perform();
		
		Thread.sleep(5000);

		driver.quit();


	}

}
