package Book_Store;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageBookStoreManager {

	
	private  WebDriver driver;
	
	
	@FindBy(xpath ="//h1[text()='BookStore Manager']")
	private static WebElement TitleBookStoreManager;
	
	@FindBy(xpath ="//button[text()='Download Data']")
	private static WebElement ButtonDownloadData;
	
	@FindBy(xpath ="//button[text()='Add Book ']")
	private static WebElement ButtonAddBook;
	
	@FindBy(xpath ="//h2[text()='Book List']")
	private static WebElement TitleBookList;
	
	@FindBy(xpath ="//button[text()='Previous']")
	private static WebElement ButtonPrevious;
	
	@FindBy(xpath ="//button[text()='Next']")
	private static WebElement ButtonNext;
	
	@FindBy(xpath ="//select[@class='border p-1']")
	private static WebElement ItemPerPageDropDown ;
	
	@FindBy(xpath ="//table/tbody/tr")
	private static WebElement bookListCount;
	
	public HomePageBookStoreManager(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);

		
	}
		
		public static String  VerifyBookStoreHeader() {
			return TitleBookStoreManager.getText();
		}
		
		public static boolean VerifyDownloadDataButtonStatus() {
			
			return ButtonDownloadData.isEnabled();
		}
		
		public static boolean VerifyAddBookButton() {
			return ButtonAddBook.isEnabled();
		}
		
		public static void VerifyItemPerPageDropDown(String value) {
			
			Select S = new Select(ItemPerPageDropDown);
			S.selectByValue(value);
		}
		
		
		
		
	
	

}
