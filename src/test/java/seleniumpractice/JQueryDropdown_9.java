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

public class JQueryDropdown_9 {

	WebDriver driver = new ChromeDriver();

	@Test
	public void getTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		String title = driver.getTitle();	
//		
		
		WebElement dropMulti = driver.findElement(By.xpath("//input[@id='justAnInputBox']"));
		dropMulti.click();	
		
		multiSelectDropDown(driver, "//span[@class='comboTreeItemTitle']", "all");
		
		multiSelectDropDown(driver, "//span[@class='comboTreeItemTitle']", "choice 1","choice 2");
		
		Thread.sleep(5000);

		driver.quit();

	}
	
	public static void multiSelectDropDown(WebDriver driver, String xpath, String... value) {
		
		//List<WebElement> multiChoiceCheck = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		List<WebElement> multiChoiceCheck = driver.findElements(By.xpath(xpath));
		
		try {
		if(!value[0].equalsIgnoreCase("all")) {
			for(WebElement item:multiChoiceCheck) {
				String text = item.getText();
				for(String val:value) {
					if(text.equals(val)) {
						item.click();
						break;
					}
				}
			}
		}else{
			for(WebElement item:multiChoiceCheck) {
				item.click();
			}
		}
		}catch(Exception e) {
			System.out.println("Might be out of bound");
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
