package ncTestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_searchables {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		System.out.println(driver.getTitle());

		Thread.sleep(3000);

		WebElement Email = driver.findElement(By.name("Email"));
		Email.clear();
		Thread.sleep(2000);

		Email.sendKeys("admin@yourstore.com");
		Thread.sleep(2000);

		WebElement Pswd = driver.findElement(By.className("password"));
		Pswd.clear();
		Thread.sleep(2000);

		Pswd.sendKeys("admin");
		Thread.sleep(2000);

		WebElement box = driver.findElement(By.id("RememberMe"));
		box.click();
		Thread.sleep(2000);

		// input fields in NC login page
		List<WebElement> fields = driver.findElements(By.xpath("//div[@class='inputs']"));
		System.out.println(fields.size());
		Thread.sleep(2000);

		WebElement Btn = driver.findElement(By.xpath("//button[@type='submit']"));
		Btn.click();
		Thread.sleep(4000);

		// links in nc
		List<WebElement> links = driver.findElements(By.xpath("//a[@class='nav-link']"));
		System.out.println(links.size());
		Thread.sleep(2000);

		WebElement catalog = driver.findElement(By.xpath("(//a[@href='#'])[4]"));
        catalog.click();
        Thread.sleep(2000);
        
        WebElement Product = driver.findElement(By.xpath("//a[@href='/Admin/Product/List']"));
        Product.click();
        Thread.sleep(2000);
        
        //dropdown buttons in products page
        List<WebElement> dropdwns = driver.findElements(By.xpath("//select[@class='form-control']"));
        System.out.println(dropdwns.size());
        Thread.sleep(2000);
        
        WebElement logout = driver.findElement(By.xpath("//a[@href='/logout']"));
        logout.click();
        Thread.sleep(2000);
        
		driver.quit();
	}

}
