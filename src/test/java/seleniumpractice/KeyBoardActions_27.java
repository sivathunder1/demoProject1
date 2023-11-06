package seleniumpractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class KeyBoardActions_27 {

	WebDriver driver = new ChromeDriver();

	public WebElement waitForElementToBePresent(WebDriver driver, By locator, int duration) {

		WebDriverWait wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);		
	}




	@Test
	public void keyBoardActions() throws InterruptedException, IOException {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//WebDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		act.sendKeys(Keys.RETURN).build().perform();
		act.sendKeys("a").build().perform();
		act.sendKeys("b").build().perform();
		act.sendKeys("c").build().perform();
		
		//textarea[@id='inputText1']
		Thread.sleep(2000);
		
		driver.navigate().to("https://text-compare.com/");
		System.out.println("Done navigation");
		
		WebElement textArea1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement textArea2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		highlightElement(driver, textArea1);
		textArea1.clear();
		textArea1.sendKeys("Thi is a sample text message");
		
		
		//Ctrl+A
		act.keyDown(Keys.CONTROL).build().perform();
		act.sendKeys("a").build().perform();
		act.keyUp(Keys.CONTROL).build().perform();
		act.perform();
		
		//Ctrl+A
		act.keyDown(Keys.CONTROL).build().perform();
		act.sendKeys("c").build().perform();
		act.keyUp(Keys.CONTROL).build().perform();
		act.perform();
		
		//TAB Key
		act.keyDown(Keys.TAB).build().perform();
		
		//Ctrl+V
		act.keyDown(Keys.CONTROL).build().perform();
		act.sendKeys("v").build().perform();
		act.keyUp(Keys.CONTROL).build().perform();
		act.perform();
		
		
		Thread.sleep(3000);

		driver.quit();

	}
	

	
	 public static WebElement highlightElement(WebDriver driver, WebElement element) {
	        // Store the original style of the element
	        String originalStyle = element.getAttribute("style");
	        // Use JavaScript to apply a red border to the element
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].style.border='3px solid red';", element);
	        // Sleep briefly to make the highlight visible
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        // Restore the original style of the element
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, originalStyle);
	        // Return the highlighted element
	        return element;
	    }



	public static void main(String[] args) throws InterruptedException {			


	}

}
