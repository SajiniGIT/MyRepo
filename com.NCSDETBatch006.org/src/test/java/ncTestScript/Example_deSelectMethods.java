package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_deSelectMethods {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/imran/Downloads/select-multiple-selectdemo%20(1)/select_multiple-select.html");
		
		driver.findElement(By.xpath("//span[@class='mbsc-textfield-tags mbsc-ios mbsc-ltr  mbsc-textfield mbsc-textfield-outline mbsc-select mbsc-textfield-stacked mbsc-textfield-outline-stacked mbsc-textarea']")).click();
		
		Thread.sleep(2000);
		
		WebElement MultiDropDown = driver.findElement(By.xpath("//span[@class='mbsc-textfield-tags mbsc-ios mbsc-ltr  mbsc-textfield mbsc-textfield-outline mbsc-select mbsc-textfield-stacked mbsc-textfield-outline-stacked mbsc-textarea']"));
		
		Select selection = new Select(MultiDropDown);
		
		selection.selectByVisibleText("Clothing & Jewelry");
		
		Thread.sleep(2000);
		
		selection.selectByValue("6");
		
		Thread.sleep(2000);
		
		selection.selectByIndex(4);
		
		Thread.sleep(2000);

		selection.deselectByVisibleText("Clothing & Jewelry");
		
		Thread.sleep(3000);

	    driver.quit();
	}	
	
}
