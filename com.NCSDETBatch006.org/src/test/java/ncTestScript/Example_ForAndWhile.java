package ncTestScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ForAndWhile {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");

		Thread.sleep(4000);
		
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("(//p[contains(text(), 'Customers')])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[contains(text(), ' Activity log')]")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='activityLog-grid']/tbody/tr"));
		
		for(int i=0; i < rows.size(); i++) {
			
            WebElement row = rows.get(i);
            
            List<WebElement> cells = driver.findElements(By.xpath("//table[@id='activityLog-grid']/tbody/tr/td"));
            
            int j = 0;
            
            while(j < cells.size()) {
            	
            	WebElement cell = cells.get(j);
            	
            	j++;
            	
            }
		}


		
	}

}
