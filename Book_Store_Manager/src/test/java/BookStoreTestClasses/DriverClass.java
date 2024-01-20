package BookStoreTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverClass {

public static  WebDriver driver;
	
public DriverClass() {
	
}


		public void launchBrowser(String browser) throws InterruptedException{
			if (browser.equalsIgnoreCase("Chrome")) {
				//ChromeOptions co= new ChromeOptions();
				driver = new ChromeDriver();
				
			} 
			else if (browser.equalsIgnoreCase("FireFox")) {
				/*System.setProperty("webdriver.firefox.driver",
						"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\FireFox.exe");*/
				driver = new FirefoxDriver(); // Browser Launch
			}

			else if (browser.equalsIgnoreCase("IE")) {
				/*System.setProperty("webdriver.IE.driver",
						"C:\\Users\\SUYOG YEOLE\\Downloads\\chromedriver_win32 (8)\\IE.exe");*/
				driver = new InternetExplorerDriver(); // Browser Launch
			}

			driver.manage().window().maximize(); // method chaining to browser maximize
			driver.get("https://book-store-manager.vercel.app/");
			Thread.sleep(3000);

	}
}


