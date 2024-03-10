package ncTestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ConditionalStatements_if_switch {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");

		Thread.sleep(4000);

		driver.findElement(By.tagName("button")).click();

		int a = 4;
		switch (a) {
		case 1:
			WebElement dashboardLink = driver.findElement(By.xpath("(//a[@href='/Admin'])[3]"));
			dashboardLink.click();
			System.out.println("Dashboard module got loaded successfully");
			break;
		case 2:
			WebElement catalogLink = driver.findElement(By.xpath("(//a[@class='nav-link active'])[1]"));
			catalogLink.click();
			System.out.println("Catalog module got loaded successfully");
			break;
		case 3:
			WebElement salesLink = driver.findElement(By.xpath("(//p[contains(text(),'Sales')])[1]"));
			salesLink.click();
			System.out.println("Sales module got loaded successfully");
			break;
		case 4:
			WebElement customersLink = driver.findElement(By.xpath("(//p[contains(text(),'Customers')])[1]"));
			customersLink.click();
			System.out.println("Customers module got loaded successfully");
			break;
		case 5:
			WebElement promotionsLink = driver.findElement(By.xpath("(//p[contains(text(),'Promotions')])[1]"));
			promotionsLink.click();
			System.out.println("Promotions module got loaded successfully");
			break;
		case 6:
			WebElement contentManagementLink = driver.findElement(By.xpath("//p[contains(text(),'Content')]"));
			contentManagementLink.click();
			System.out.println("Content management module got loaded successfully");
			break;
		case 7:
			WebElement configurationLink = driver.findElement(By.xpath("//p[contains(text(),'Confi')]"));
			configurationLink.click();
			System.out.println("Configuration module got loaded successfully");
			break;
		case 8:
			WebElement systemLink = driver.findElement(By.xpath("(//p[contains(text(),'System')])[1]"));
			systemLink.click();
			System.out.println("System module got loaded successfully");
			break;
		case 9:
			WebElement reportsLink = driver.findElement(By.xpath("//p[contains(text(),'Reports')]"));
			reportsLink.click();
			System.out.println("Reports module got loaded successfully");
			break;
		case 10:
			WebElement helpLink = driver.findElement(By.xpath("//p[contains(text(),'Help')]"));
			helpLink.click();
			System.out.println("Help module got loaded successfully");
			break;
		default:
			System.out.println("Invalid module name");
		}
		Thread.sleep(5000);

		WebElement customerRolesLink = driver.findElement(By.xpath("//p[contains(text(),' Customer roles')]"));
		if (customerRolesLink.isDisplayed()) {
			customerRolesLink.click();
			System.out.println("Customer roles page got loaded successfully");

		} else {
			System.out.println("Plese check the Submodule name again");
		}

		Thread.sleep(5000);

		WebElement registeredCustomersNames = driver.findElement(By.xpath("//td[contains(text(),'Registered')]"));
		if (registeredCustomersNames.isDisplayed()) {
			WebElement registeredCustomersEditBtn = driver.findElement(By.xpath("//a[@href='Edit/3']"));
			registeredCustomersEditBtn.click();
			System.out.println(
					"Registered customers edit button got clicked and Edit Registered customers role details page got loaded successfully");
		} else {
			System.out.println("Plese check the details again");
		}
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='FreeShipping']")).click();

		driver.findElement(By.xpath("//button[@name='save']")).click();

		WebElement successMessage = driver
				.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']"));
		if (successMessage.isDisplayed()) {
			System.out.println("The customer role has been updated successfully");
			driver.findElement(By.xpath("//button[@class='close']")).click();
		} else {
			System.out.println("Failed to update a Registered Customer roles");
		}
		Thread.sleep(5000);

		WebElement addNewBtn = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		if (addNewBtn.isDisplayed()) {
			addNewBtn.click();
			System.out.println("Add new button got clicked and Add a new customer role page got loaded successfully");
		} else {
			System.out.println("Please refresh the page or check the details again");
		}
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("xyz");
		driver.findElement(By.xpath("//button[@name='save']")).click();

		WebElement successMessage2 = driver
				.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']"));
		if (successMessage2.isDisplayed()) {
			driver.findElement(By.xpath("//button[@class='close']")).click();
			System.out.println("The new customer role has been added successfully");
		} else {
			System.out.println("Failed to save the new customer role details");
		}
		Thread.sleep(5000);
		driver.quit();

	}

}

