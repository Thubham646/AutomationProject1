package Book_Store;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBookForm {
	private WebDriver driver;

	@FindBy(xpath = "//button[text()='Add Book ']")
	private static WebElement buttonAddBook;

	@FindBy(xpath = "//h2[text()='Add Book']")
	private static WebElement addBookTitle;

	@FindBy(xpath = "//input[@id='title']")
	private static WebElement inputTitle;

	@FindBy(xpath = "//input[@id='author']")
	private static WebElement inputAuthor;

	@FindBy(xpath = "//input[@id='price']")
	private static WebElement inputPrice;

	@FindBy(xpath = "//button[@type='submit']")
	private static WebElement saveButton;

	@FindBy(xpath = "//button[text()= 'Cancel']")
	private static WebElement cancelButton;

	@FindBy(xpath = "//button[text()= 'Close Form']")
	private static WebElement closeFormButton;

	
	public AddBookForm(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public static String  VerifyAddBookFormTitle() {
		return addBookTitle.getText();
		
	}

	public static void ClickOnAddBookButton() {
		buttonAddBook.click();
	}

	public static void SendBookTitle(String title) {
		inputTitle.clear();
		inputTitle.sendKeys(title);
		
	}

	public static void SendBookAuthor(String author) {
		inputAuthor.clear();
		inputAuthor.sendKeys(author);
	}

	public static void SendPrice(String price) {
		inputPrice.clear();
		inputPrice.sendKeys(price);
	}

	public static void ClickOnSaveButton() {
		saveButton.click();
		
	}

	public static void ClickOnCancelButton() {
		cancelButton.click();
	}
	
	public static void ClickOnCloseButton() {
		closeFormButton.click();
	}
	
	public static boolean verifyAddBookButtonStatus() {
		return buttonAddBook.isDisplayed();
	}
}
