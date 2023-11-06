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

public class AutoCompleteGooglePlacesSuggest_13 {

	WebDriver driver = new ChromeDriver();

	@Test
	public void sortedDropdown() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://twoplugs.com/");
		
		WebElement linkDrop = driver.findElement(By.xpath("//a[text()='Live Posting']"));
		linkDrop.click();	
		
		WebElement searcBox = driver.findElement(By.id("autocomplete"));
		searcBox.clear();
		searcBox.sendKeys("Toronto");
		
		String text;
		
		do {
			
			searcBox.sendKeys(Keys.ARROW_DOWN);
			text = searcBox.getAttribute("value");
			
			if(text.equals("Toronto, OH, USA")) {
				searcBox.sendKeys(Keys.ENTER);
			}
			Thread.sleep(3000);
		}while(!text.isEmpty());
		
		
		Thread.sleep(5000);

		driver.quit();

	}
	


	public static void main(String[] args) throws InterruptedException {			


	}

}
