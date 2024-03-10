package ncTestScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ActionMethods2 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// driver.manage().window().fullscreen();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");
		Thread.sleep(3000);

		String title = driver.getTitle();
		Thread.sleep(3000);
		System.out.println(title);

		String url = driver.getCurrentUrl();
		Thread.sleep(3000);
		System.out.println(url);

		String SourceCode = driver.getPageSource();
		Thread.sleep(3000);
		System.out.println(SourceCode);

		String windowID = driver.getWindowHandle();
		Thread.sleep(3000);
		System.out.println(windowID);

		driver.manage().window().minimize();
		driver.quit();

	}

}
