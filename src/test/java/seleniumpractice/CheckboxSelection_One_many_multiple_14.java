package seleniumpractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.cucumber.messages.internal.com.google.protobuf.Duration;

public class CheckboxSelection_One_many_multiple_14 {

	WebDriver driver = new ChromeDriver();

	@Test
	public void sortedDropdown() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://total-qa.com/checkbox-example/");
		
		//1. Select one single check box
		WebElement mondayCheck =  driver.findElement(By.xpath("//input[@id='monday']"));
		mondayCheck.click();
		
		List<WebElement> multiCheck =  driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total number of checkboxes : " + multiCheck.size());
		
		for(WebElement chk:multiCheck) {
			chk.click();
			
		}
		
		//selecting only monday and sunday
		for(WebElement chk:multiCheck) {
			String chekboxname = chk.getAttribute("id");
			if(chekboxname.equalsIgnoreCase("Monday") || chekboxname.equalsIgnoreCase("Sunday") ) {
				chk.click();
			}			
			
		}
		
		//avoiding the last two checkboxes
		
		int toatlNumberOfChkBoxes = multiCheck.size();
		
		for (int i=toatlNumberOfChkBoxes-2;i<toatlNumberOfChkBoxes;i++) {
			multiCheck.get(i).click();
		}
		
		//how to select first few checkboxes		
		
		for (int i=0;i<toatlNumberOfChkBoxes;i++) {
			if(i<2) {
			multiCheck.get(i).click();
			}
		}
		
		Thread.sleep(5000);

		driver.quit();

	}
	


	public static void main(String[] args) throws InterruptedException {			


	}

}
