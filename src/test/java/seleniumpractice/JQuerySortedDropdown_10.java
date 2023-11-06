package seleniumpractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JQuerySortedDropdown_10 {

	WebDriver driver = new FirefoxDriver();

	@Test
	public void sortedDropdown() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://twoplugs.com/");
		//String title = driver.getTitle();	
//		
		
		WebElement linkDrop = driver.findElement(By.xpath("//a[text()='Live Posting']"));
		linkDrop.click();	
		Thread.sleep(5000);
		
		WebElement allDropdown = driver.findElement(By.name("category_id"));
		allDropdown.isDisplayed();
		allDropdown.isEnabled();
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(allDropdown)).click();
		allDropdown.click();
		
		Select drop = new Select(allDropdown);
		List<WebElement> options = drop.getOptions();
		
		ArrayList originalList = new ArrayList();
		ArrayList tempList = new ArrayList();
		
		for(WebElement option : options) {
			originalList.add(option.getText());
			tempList.add(option.getText());
		}
		
		Collections.sort(tempList);
		
		if(originalList.equals(tempList)) {
			System.out.println("Dropdown sorted");
		}else {
			System.out.println("Dropdown unsorted"); 
		
		}
		
		
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
