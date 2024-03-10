package ncTestCases;

import org.openqa.selenium.chrome.ChromeDriver;

import ncInBuiltPOM.InBuildNCLoginPage;
import ncInBuiltPOM.InBuiltCategoriesPage_NC;
import ncInBuiltPOM.InBuiltLoginPage_NC;
import ncPageObjectModels.AbstractComponents_NC;

public class ValidateAvailabilityOfElectronicsCategoryInTheTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		AbstractComponents_NC acn = new AbstractComponents_NC(driver);
		InBuiltLoginPage_NC ilpn = new InBuiltLoginPage_NC(driver);
		InBuiltCategoriesPage_NC icpn = new InBuiltCategoriesPage_NC(driver);

		acn.landingPageSetUp();
		Thread.sleep(5000);
		ilpn.enterEmailField();
		ilpn.enterPasswordField();
		ilpn.clickOnLoginBtn();
		Thread.sleep(5000);
		acn.clickOnCatalog();
		Thread.sleep(5000);
		acn.clickOnCategory();
		Thread.sleep(5000);
		icpn.enterCategoryName();
		Thread.sleep(5000);
		icpn.clickOnSearchButton();
		Thread.sleep(5000);
		icpn.categoryVerification();
		Thread.sleep(7000);
		acn.doLogout();
		Thread.sleep(5000);
		acn.tearDown();

	}

}
