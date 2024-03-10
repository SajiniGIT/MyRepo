package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pings_LiChess {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://lichess.org/");
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		driver.findElement(By.id("form3-username")).sendKeys("KPCA-IND_100245");
		
		driver.findElement(By.id("form3-password")).sendKeys("KPCA-IND");
		
		driver.findElement(By.xpath("(//button[@class='submit button'])[1]")).click();

	}

}
