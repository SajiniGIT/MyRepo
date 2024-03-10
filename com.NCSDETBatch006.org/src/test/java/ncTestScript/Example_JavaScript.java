package ncTestScript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_JavaScript {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");

		Thread.sleep(4000);

		JavascriptExecutor jsExe = (JavascriptExecutor) driver;

		jsExe.executeScript("document.getElementById('Email').value='admin@yourstore.com';");

		Thread.sleep(4000);

		jsExe.executeScript("document.getElementById('Email').style.border=\"6px blue solid\";");

		Thread.sleep(4000);

		jsExe.executeScript("document.getElementById('Email').style.background=\"yellow\";");

		Thread.sleep(4000);

		jsExe.executeScript("document.getElementById('Password').style.border=\"6px blue solid\";");

		Thread.sleep(4000);

		jsExe.executeScript("document.getElementById('Password').style.background=\"yellow\";");

		Thread.sleep(4000);

		jsExe.executeScript("(document.getElementsByName('RememberMe'))[0].click();");

		Thread.sleep(4000);

		jsExe.executeScript("(document.getElementsByTagName('button'))[0].click();");

		Thread.sleep(4000);  

		jsExe.executeScript("window.scrollBy(0,300);");

		Thread.sleep(4000);

		jsExe.executeScript("window.scrollTo(0,500);");

		Thread.sleep(4000);

		jsExe.executeScript("(document.getElementsByClassName('col-md-4 col-xs-12 text-md-right text-center'))[0].scrollIntoView();");

		Thread.sleep(4000);

		driver.quit();

	}

}
