package ncTestScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_ForLoop {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//p[contains(text(),'Sales')])[1]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//p[contains(text(),'Orders')])[1]")).click();

		Thread.sleep(3000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='orders-grid']/tbody/tr")); // get all rows of
																										// the table

		for (int i = 0; i < rows.size(); i++) {

			WebElement row = rows.get(i);

			List<WebElement> cells = driver.findElements(By.xpath("//table[@id='orders-grid']/tbody/tr/td"));

			for (int j = 0; j < cells.size(); j++) {

				WebElement cell = cells.get(j);

				//System.out.println(cell.getSize());

				System.out.println(cell.getText());
			}

		}
        
		driver.quit();
	}

}
