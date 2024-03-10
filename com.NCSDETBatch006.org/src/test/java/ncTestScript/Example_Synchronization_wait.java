package ncTestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_Synchronization_wait {

	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("Button"))));

		driver.findElement(By.tagName("Button")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//p[contains(text(),'System')])[1]"))));
		
	    driver.findElement(By.xpath("(//p[contains(text(),'System')])[1]")).click();
	    
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[contains(text(),' System information')]"))));
	    
	    driver.findElement(By.xpath("//p[contains(text(),' System information')]")).click();
	    
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='card-body']"))));
	    
	    String text = driver.findElement(By.xpath("//div[@class='card-body']")).getText();
	   
	    System.out.println(text);
		
	    driver.quit();

	}
	

}
