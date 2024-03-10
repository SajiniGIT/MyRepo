package ncTestCases;

import org.openqa.selenium.chrome.ChromeDriver;

import ncInBuiltPOM.InBuildNCLoginPage;
import ncPageObjectModels.AbstractComponents_NC;

public class ValidateNCLoginWithInBuiltPOM {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		AbstractComponents_NC acn = new AbstractComponents_NC(driver);
		InBuildNCLoginPage inlp = new InBuildNCLoginPage(driver);

		acn.landingPageSetUp();
		Thread.sleep(5000);
		inlp.enterEmail();
		inlp.enterPassword();
		inlp.clickOnLoginBtn();
		Thread.sleep(5000);
		acn.doLogout();
		Thread.sleep(5000);
		acn.tearDown();

	}

}
