package seleniumpractice;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OpenLinkInaNewTab_30 {

	WebDriver driver = new ChromeDriver();

	public WebElement waitForElementToBePresent(WebDriver driver, By locator, Duration duration) {

		WebDriverWait wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);		
	}




	@Test
	public void toolTip_MultiWindow_Lcoations() throws InterruptedException, IOException {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//WebDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String tab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));		
		highlightElement(driver, register, "Yes");
		
		System.out.println("Location of the element "+ register.getLocation());
		System.out.println("X Location of the element : "+ register.getLocation().getX());
		System.out.println("Y Location of the element : "+ register.getLocation().getY());
		
		System.out.println("Width Location of the element : "+ register.getSize().getWidth());
		System.out.println("Height Location of the element : "+ register.getSize().getHeight());
		
		register.sendKeys(tab);
				
		Thread.sleep(3000);

		driver.close();

	}
	

	
	 public static WebElement highlightElement(WebDriver driver, WebElement element, String restoreYesNo) {
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
	        if(restoreYesNo.equalsIgnoreCase("Yes") || restoreYesNo.equalsIgnoreCase("Y"))
	        {
	        // Restore the original style of the element
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, originalStyle);
	        // Return the highlighted element
	        }else {
	        	js.executeScript("arguments[0].style.border='3px solid red';", element);
	        }
	        return element;
	    }



	public static void main(String[] args) throws InterruptedException {			


	}

}
