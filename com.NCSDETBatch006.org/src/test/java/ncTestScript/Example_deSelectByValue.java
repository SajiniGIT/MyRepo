package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_deSelectByValue {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");

		driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.xpath("(//p[contains(text(),'Customers')])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//p[contains(text(),'Customers')])[2]")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//div[@role='listbox']")).click();
		driver.findElement(By.id("SelectedCustomerRoleIds")).click();
		Thread.sleep(3000);
		
		WebElement CustomerRolesList = driver.findElement(By.id("SelectedCustomerRoleIds"));
		Select selection = new Select(CustomerRolesList);
		
		selection.selectByVisibleText("Administrators");
		Thread.sleep(3000);
		
		selection.selectByValue("4");
		Thread.sleep(3000);
		
		selection.selectByIndex(4);
		Thread.sleep(3000);
		
		//selection.deselectByVisibleText("Administrators");
		//Thread.sleep(5000);
		
		//driver.findElement(By.xpath("(//p[contains(text(),'Sales')])[1]")).click();
		//Thread.sleep(3000);

		//driver.findElement(By.xpath("//p[contains(text(),'Shopping carts')]")).click();
		//Thread.sleep(3000);

		//driver.findElement(By.id("BillingCountryId")).click();
		//boolean Val = driver.findElement(By.id("BillingCountryId")).isDisplayed();
		//System.out.println("Is Billing country multi select dropdown? " + Val);

		//WebElement BillingCountry = driver.findElement(By.id("BillingCountryId"));
		//Select selection = new Select(BillingCountry);

		//selection.selectByIndex(1);
		//Thread.sleep(2000);

		//selection.selectByValue("2");
		//Thread.sleep(2000);

		//selection.selectByVisibleText("India");
		//Thread.sleep(3000);

        //selection.selectByIndex(14);//
        //Thread.sleep(2000);//

        //selection.selectByValue("70");//
        //Thread.sleep(3000);//

        //selection.selectByVisibleText("United Kingdom");//
        //Thread.sleep(3000);//

		//selection.deselectByVisibleText("India");
		//Thread.sleep(2000);

		//selection.deselectByIndex(1);
		
		//Thread.sleep(2000);

		driver.quit();

	}

}
