package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleDropdowns_07 {

	WebDriver driver = new ChromeDriver();

	@Test
	public void getTest() throws InterruptedException {
		//Find elements will not thrown no such elements exception and returns zero
		//Find element will throw no such elements error 
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php");
		String title = driver.getTitle();
		
		WebElement dropMulti = driver.findElement(By.id("asdasdsa"));
		selectDropDownElement(dropMulti,"India");
		
		Thread.sleep(5000);

		driver.quit();

	}
	
	public static void selectDropDownElement(WebElement ele, String value) {
		Select drp = new Select(ele);
		List<WebElement> listedOptions = drp.getOptions(); 
		
		for(WebElement option : listedOptions) {
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
		}
			
	}
	

	//	@AfterClass
	//	public void driverQuit() {
	//		
	//	}
	//	
	public static void main(String[] args) throws InterruptedException {			


	}

}
