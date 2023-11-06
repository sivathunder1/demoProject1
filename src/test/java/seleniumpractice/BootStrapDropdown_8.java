package seleniumpractice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BootStrapDropdown_8 {

	WebDriver driver = new ChromeDriver();

	@Test
	public void getTest() throws InterruptedException {
		//Find elements will not thrown no such elements exception and returns zero
		//Find element will throw no such elements error 
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		//String title = driver.getTitle();
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		
		WebElement dropBootstrap = driver.findElement(By.xpath("//a[normalize-space()='Select Product Type']"));
		dropBootstrap.click();
		
		List<WebElement> completeList = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		int list = completeList.size();
		System.out.println(list);
		
		for(WebElement fullList : completeList) {
			System.out.println(fullList.getText());
			if(fullList.getText().equalsIgnoreCase("Deposits")) {
				fullList.click();
				break;
			}
		}
		
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
