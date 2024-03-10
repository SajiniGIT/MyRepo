package ncTestScript;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Variables {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
        WebElement search = driver.findElement(By.className("gLFyf"));
        search.sendKeys("nopcommerce login as admin");
        Thread.sleep(3000);
        
        search.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        
        WebElement url = driver.findElement(By.xpath("//h3[text()='Your store. Login']"));
        url.click();
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
        
        WebElement Btn = driver.findElement(By.xpath("//button[@type='submit']"));
        Btn.click();
        Thread.sleep(4000);
        
        WebElement Dash = driver.findElement(By.xpath("(//a[@href='/Admin'])[3]"));
        Dash.click();
        Thread.sleep(2000);
        
        WebElement plusbtn = driver.findElement(By.xpath("(//button[@data-card-widget='collapse'])[1]"));
        plusbtn.click();
        Thread.sleep(2000);
        
        WebElement title = driver.findElement(By.xpath("(//div[@class='col-12'])[1]"));
        title.getText();
        System.out.println(title.getText());
        Thread.sleep(2000);
        
        List<WebElement> links = driver.findElements(By.tagName("h5"));
        System.out.println(links.size());
        
        WebElement logout = driver.findElement(By.xpath("//a[@href='/logout']"));
        logout.click();
        Thread.sleep(2000);
        
        driver.quit();
	}

}
