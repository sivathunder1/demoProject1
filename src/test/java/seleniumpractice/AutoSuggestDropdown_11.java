package seleniumpractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
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

import io.cucumber.messages.internal.com.google.protobuf.Duration;

public class AutoSuggestDropdown_11 {

	WebDriver driver = new ChromeDriver();

	@Test
	public void sortedDropdown() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		List<WebElement> dynamicDrop = driver.findElements(By.xpath("//li[@class='sa_sg as_extra_pad']"));
		
		System.out.println("Autosuggestion size : " + dynamicDrop.size());
		
		for(WebElement list : dynamicDrop) {
			if(list.getText().equalsIgnoreCase("selenium tutorial")) {
				list.click();
				break;
			}
		}
		
		Thread.sleep(5000);

		driver.quit();

	}
	


	public static void main(String[] args) throws InterruptedException {			


	}

}
