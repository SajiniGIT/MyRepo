package ncTestScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_WebTables {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");

		Thread.sleep(4000);
		
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//p[contains(text(), 'Customers')])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[contains(text(), 'Online customers')]")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='onlinecustomers-grid']/tbody/tr"));
		
		Thread.sleep(3000);
		
	    int rowsCount = rows.size();
	    
	    System.out.println("All rows count is : " + rowsCount);
	    
	    Thread.sleep(3000);
	    
	    List<WebElement> columns = driver.findElements(By.xpath("//table[@id='onlinecustomers-grid']/tbody/tr[2]/td"));
	    
	    Thread.sleep(3000);
	    
	    int columnCount = columns.size();
	    
	    System.out.println("All columns count is : " + columnCount);
	    
	    Thread.sleep(3000);
		
		driver.quit();
			
	}

}
