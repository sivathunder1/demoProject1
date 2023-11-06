package seleniumpractice;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Waits_Implicit_Explicit_Fluent_21 {

	WebDriver driver = new ChromeDriver();
	
	public WebElement waitForElementToBePresent(WebDriver driver, By locator, Duration duration) {
		
		WebDriverWait wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);		
	}
	


	
	@Test
	public void frames() throws InterruptedException, IOException {
//		//ChromeOptions options = new ChromeOptions();
//		//options.addArguments("--disable-notifications");
//		//WebDriver driver1 = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
//		
//		//implicit wait
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		//Explicit wait
//		WebElement button = driver.findElement(By.id("Element to wait"));
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By) button));		
//		button.click();
//		
//		//Fluent wait
//	    final WebElement revealed = driver.findElement(By.id("revealed"));
//        Wait<WebDriver> waitFlu = new FluentWait<WebDriver>(driver)
//                .withTimeout(10, TimeUnit.SECONDS)
//                .pollingEvery(300, TimeUnit.MILLISECONDS);
//                //.ignoreAll(ElementNotInteractableException.class);
//
//        driver.findElement(By.id("reveal")).click();
//        waitFlu.until(d -> {
//            revealed.sendKeys("Displayed");
//            return true;
//        });
//		
//		
		Thread.sleep(3000);

		driver.quit();

	}
	


	public static void main(String[] args) throws InterruptedException {			


	}

}
