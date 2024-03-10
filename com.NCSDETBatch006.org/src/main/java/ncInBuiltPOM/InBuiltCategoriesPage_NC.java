package ncInBuiltPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InBuiltCategoriesPage_NC {
	
WebDriver driver;
	
	public InBuiltCategoriesPage_NC(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="SearchCategoryName")
	WebElement CatName;
	
	@FindBy(id="search-categories")
	WebElement SearchBtn;
	
	@FindBy(xpath="//table[@id='categories-grid']/tbody/tr/td[2]")
	WebElement CatElectronics;
	
	public void enterCategoryName() {
		CatName.sendKeys("Electronics");
	}
	
	public void clickOnSearchButton() {
		SearchBtn.click();
	}
	
	public void categoryVerification() {
		boolean val = CatElectronics.isDisplayed();
		if(val==true) {
			System.out.println("Electronics Category is presented in the Category table");
		} else {
			System.out.println("Electronics Category is not presented in the Category table");
			
		}
	}

}
