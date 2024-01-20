package BookStoreTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Book_Store.AddBookForm;
import Book_Store.AddBookForm;
import Book_Store.HomePageBookStoreManager;

public class VerifyAddBookForm extends DriverClass{
	
	AddBookForm addBook;
	HomePageBookStoreManager homePage;
	
	@BeforeClass
	public void openBrowser() throws InterruptedException {
		launchBrowser("Chrome");
		addBook = new AddBookForm(driver);
		homePage = new HomePageBookStoreManager(driver);
	}
	
	@Test
	public void VerifyAddBookFormWithAllFields()  {
		
		AddBookForm.ClickOnAddBookButton();
		AddBookForm.SendBookTitle("Java Programming");
		AddBookForm.SendBookAuthor("B Prasanalakshmi");
		AddBookForm.SendPrice("500");
		int preSaveBookListCount = Utility.fetchBookListCount();
		AddBookForm.ClickOnSaveButton();	
		int postSaveBookListCount = Utility.fetchBookListCount();
		Assert.assertNotEquals(preSaveBookListCount, postSaveBookListCount, "BookList count should be increase");
		Assert.assertEquals(homePage.VerifyDownloadDataButtonStatus(), true, "DownloadData button should be enabled");
	}
	
	@Test
	public void VerifyAddBookWithTitleOnly() {
		AddBookForm.ClickOnAddBookButton();
		AddBookForm.SendBookTitle("Python Programming");
		int preSaveBookListCount = Utility.fetchBookListCount();
		AddBookForm.ClickOnSaveButton();	
		int postSaveBookListCount = Utility.fetchBookListCount();
		Assert.assertEquals(preSaveBookListCount, postSaveBookListCount, "Data should not save, as all fields are mandatory");
		
	}
	
	@Test
	public void VerifyAddBookWithoutPrice() throws IOException {
		
		AddBookForm.SendBookTitle("Advance Java Programming");
		AddBookForm.SendBookAuthor("B Prasanalakshmi");
		int preSaveBookListCount = Utility.fetchBookListCount();
		AddBookForm.ClickOnSaveButton();	
		int postSaveBookListCount = Utility.fetchBookListCount();
		Assert.assertEquals(preSaveBookListCount, postSaveBookListCount, "Data should not save, as all fields are mandatory");
		
	}
	
	
	@Test
	public void verifyCancelButton() {
		AddBookForm.ClickOnCancelButton();
		Assert.assertEquals(addBook.verifyAddBookButtonStatus(), true);
	}
	
	@Test
	public void verifyCloseButton() {
		AddBookForm.ClickOnAddBookButton();
		AddBookForm.ClickOnCloseButton();
		Assert.assertEquals(addBook.verifyAddBookButtonStatus(), true);
	}
	
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
}
