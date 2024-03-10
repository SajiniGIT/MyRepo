
package ncTestScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ConfirmationJavaAlert {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");

		Thread.sleep(3000);
		
		driver.findElement(By.tagName("Button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[contains(text(),'Content management')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[contains(text(),'Blog comments')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@class='btn btn-default'])[4]")).click();
			
		Thread.sleep(3000);
		
	    Alert popup = driver.switchTo().alert();
	
	    Thread.sleep(3000);
		
		popup.dismiss();
	    
		Thread.sleep(3000);
	    
	    driver.quit();


	}

}
