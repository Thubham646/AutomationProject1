package BookStoreTestClasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Book_Store.HomePageBookStoreManager;

public class VerifyHomePage extends DriverClass{
	
	HomePageBookStoreManager homePage;
	
	@BeforeClass
	public void openBrowser() throws InterruptedException {
		launchBrowser("Chrome");
		homePage = new HomePageBookStoreManager(driver);
	}

	@Test
	public void verifyBookStoreManagerTitle()  {
		String expctedHeaderText = "BookStore Manager";
		String actualHeaderText = homePage.VerifyBookStoreHeader();
		Assert.assertEquals(actualHeaderText, expctedHeaderText, "Home page tite should be displayed > 'BookStore Manager'");
	}
	
	@Test
	public void VerifyAddBookButtonIsEnabled()  {
		boolean expButtonStatus = true;
		boolean actButtonStatus = homePage.VerifyAddBookButton();
		Assert.assertEquals(actButtonStatus, expButtonStatus, "ADD Book Button should be enabled ");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	

}
