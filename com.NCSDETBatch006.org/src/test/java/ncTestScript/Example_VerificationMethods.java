package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_VerificationMethods {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");

		driver.findElement(By.tagName("button")).click();

		boolean Val1 = driver.findElement(By.xpath("//img[@class='brand-image-xl logo-xl']")).isDisplayed();
		System.out.println("is nopCommerce logo diaplayed? " + Val1);

		boolean Val2 = driver.findElement(By.xpath("//input[@placeholder='Search']")).isDisplayed();
		System.out.println("Is Search placehlder is displayed? " + Val2);

		driver.findElement(By.xpath("//p[contains(text() , 'Configuration')]")).click();
		boolean Val3 = driver.findElement(By.xpath("//p[contains(text() , 'Configuration')]")).isDisplayed();
		System.out.println("Is Configuration appearing? " + Val3);

		driver.findElement(By.xpath("//p[contains(text() , 'Settings')]")).click();
		boolean Val4 = driver.findElement(By.xpath("//p[contains(text() , 'Settings')]")).isEnabled();
		System.out.println("Is Settings button enabled? " + Val4);

		driver.findElement(By.xpath("//p[contains(text() , 'General set')]")).click();
		boolean Val5 = driver.findElement(By.xpath("//p[contains(text() , 'General set')]")).isEnabled();
		System.out.println("Is General Settings button enabled? " + Val5);

		driver.findElement(By.xpath("//span[@class='onoffswitch-switch']")).click();
		Thread.sleep(3000);
		boolean Val6 = driver.findElement(By.xpath("//span[@class='onoffswitch-switch']")).isEnabled();
		System.out.println("Is advanced-settings-mode enabled? " + Val6);

		driver.findElement(By.id("StoreInformationSettings_DisplayEuCookieLawWarning")).click();
		Thread.sleep(3000);
		boolean Val7 = driver.findElement(By.id("StoreInformationSettings_DisplayEuCookieLawWarning")).isSelected();
		System.out.println("Is Display EU cookie law warning checkbox got selected? " + Val7);
		
		driver.findElement(By.id("StoreInformationSettings_StoreClosed")).click();
		Thread.sleep(3000);
	    boolean Val8 = driver.findElement(By.id("StoreInformationSettings_StoreClosed")).isSelected();
	    System.out.println("Is Store closed checkbox got selected? " + Val8);
		
	    driver.quit();

	}

}
