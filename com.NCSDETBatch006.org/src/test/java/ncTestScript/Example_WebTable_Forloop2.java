package ncTestScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_WebTable_Forloop2 {

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
		
		driver.findElement(By.xpath("//p[contains(text(), ' Activity log')]")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='activityLog-grid']/tbody/tr"));
		
		Thread.sleep(3000);
		
		int rowsCount = rows.size();
		
		Thread.sleep(3000);
		
		System.out.println("All rows Count is : " + rowsCount);
		
		Thread.sleep(3000);
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='activityLog-grid']/tbody/tr/td"));
		
		Thread.sleep(3000);
		
	    int columnsCount = columns.size();
	    
	    Thread.sleep(3000);
	    
	    System.out.println("All columns Count is : " + columnsCount);
	    
	    Thread.sleep(5000);
	    
	    for (int r=1; r<= rowsCount; r++) {
	    	
	    	for (int c=1; c<= columnsCount; c++) {


	          String val = driver.findElement(By.xpath("//table[@id='activityLog-grid']/tbody/tr[" + r + "]/td[" + c + "]")).getText();
	    	
	          System.out.print(val + "   ");
	    	
	    	}	
	    	//System.out.println();
	    }
		
		driver.quit();
	}

}


