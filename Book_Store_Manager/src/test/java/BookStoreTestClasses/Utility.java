package BookStoreTestClasses;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility extends DriverClass {
 	
	public static int fetchBookListCount(){
		
		List <WebElement> bookList=driver.findElements(By.xpath("//table/tbody/tr"));
		return bookList.size();
		
	}
	
	
	

}
