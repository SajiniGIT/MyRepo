package ncTestCases;

import org.openqa.selenium.chrome.ChromeDriver;

import ncPageObjectModels.AbstractComponents_NC;
import ncPageObjectModels.DashBoardPage_NC;
import ncPageObjectModels.LoginPage_NC;
import ncPageObjectModels.OrdersPage_NC;

public class ValidateAvailabilityOfOrdersWithProductName {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		AbstractComponents_NC acn = new AbstractComponents_NC(driver);
		LoginPage_NC lpn = new LoginPage_NC(driver);
		DashBoardPage_NC dpn = new DashBoardPage_NC(driver);
		OrdersPage_NC opn = new OrdersPage_NC(driver);

		acn.landingPageSetUp();
		Thread.sleep(5000);
		lpn.enterEmailField();
		lpn.enterPasswordField();
		lpn.clickOnLogin();
		Thread.sleep(5000);
		dpn.dashBoardVerification();
		Thread.sleep(3000);
		acn.clickOnSales();
		Thread.sleep(3000);
		acn.clickOnOrders();
		Thread.sleep(3000);
		opn.enterProductName();
		Thread.sleep(3000);
		opn.clickOnSearchButton();
		Thread.sleep(3000);
		acn.doLogout();
		Thread.sleep(3000);
		acn.tearDown();

	}

}
