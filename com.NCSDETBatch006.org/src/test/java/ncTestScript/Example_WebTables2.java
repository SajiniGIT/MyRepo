package ncTestScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_WebTables2 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

		Thread.sleep(5000);

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.linkText("Become a Seller"))).perform();

		action.click().perform();

		Thread.sleep(5000);

		action.sendKeys(Keys.DOWN)
				.scrollToElement(
						driver.findElement(By.xpath("//table[@class='styles__TableContainer-sc-1d66s2n-0 dtWRkx']")))
				.perform();

		Thread.sleep(5000);

		List<WebElement> rows = driver
				.findElements(By.xpath("//table[@class='styles__TableContainer-sc-1d66s2n-0 dtWRkx']/tbody/tr"));

		int rowsCount = rows.size();

		System.out.println("All rows count is : " + rowsCount);

		Thread.sleep(5000);

		List<WebElement> columns = driver
				.findElements(By.xpath("//table[@class='styles__TableContainer-sc-1d66s2n-0 dtWRkx']/tbody/tr[1]/td"));

		int columnsCount = columns.size();

		System.out.println("All columns count is : " + columnsCount);

		Thread.sleep(5000);

		/*for (int r = 1; r <= rowsCount; r++) {

			for (int c = 1; c <= columnsCount; c++) {

				String val = driver
						.findElement(By.xpath("//table[@class='styles__TableContainer-sc-1d66s2n-0 dtWRkx']/tbody/tr["
								+ r + "]/td[" + c + "]"))
						.getText();

				System.out.print(val + " ");

			}

			System.out.println();
		}*/
		
		driver.quit();

	}

}
