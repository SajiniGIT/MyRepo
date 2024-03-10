package ncTestScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_SimpleJavaAlert {

	public static void main(String[] args) throws Exception {
		
		 ChromeDriver driver = new ChromeDriver();
         
         driver.manage().window().maximize();

 		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");

 		Thread.sleep(3000);
 		
 		driver.findElement(By.tagName("Button")).click();
 		
 		Thread.sleep(3000);
 		
 		driver.findElement(By.xpath("//p[contains(text(),'Content management')]")).click();
 		
 		Thread.sleep(3000);
 		
 		driver.findElement(By.xpath("//p[contains(text(),'Polls')]")).click();
 		
 		Thread.sleep(3000);
 		
 		driver.findElement(By.xpath("(//a[@class='btn btn-default'])[3]")).click();
 		
 		Thread.sleep(3000);
 		
 		driver.findElement(By.xpath("//button[@id='addPollAnswer']")).click();
 		
 		Thread.sleep(3000);
 		
 	    Alert popup = driver.switchTo().alert();
 	    
 	    popup.accept();
 	    
 	    Thread.sleep(3000);
 	  
    	driver.switchTo().defaultContent();
 	  
  		Thread.sleep(3000);
  		
  		driver.quit();


	}

}
