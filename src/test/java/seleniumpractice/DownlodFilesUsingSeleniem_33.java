package seleniumpractice;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DownlodFilesUsingSeleniem_33 {

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
		
		String location = System.getProperty("user.dir")+"\\Downloads\\";
		HashMap preferences = new HashMap();
		preferences.put("download.default.directory", location);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");		
		//table[@id='table-files']//tbody//tr[1]//td[5]//a
		WebElement downloadButton1 = driver.findElement(By.xpath("//table[@id='table-files']//tbody//tr[1]//td[5]//a"));
		highlightElement(driver, downloadButton1, "Yes");
		downloadButton1.click();
		
		
			
				
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
	 
	// Flashing Element
	    public void flashElement(WebElement element) {
	        String originalStyle = element.getAttribute("style");
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].style.border='2px solid red';" +
	                "arguments[0].style.animation='flash 2s infinite';", element);
	        // Restore the original style after a delay (e.g., 3 seconds)
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, originalStyle);
	    }

	    // Drawing border & take screenshot of the Element
	    public void drawBorderAndTakeScreenshot(WebElement element) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].style.border='2px solid red';", element);
	        // Take a screenshot using your preferred method (e.g., Selenium's TakesScreenshot interface)
	    }

	    // Get the title of the page
	    public String getPageTitle() {
	        return driver.getTitle();
	    }

	    // Click action
	    public void clickElement(WebElement element) {
	        element.click();
	    }

	    // Generate alert
	    public void generateAlert(String message) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("alert(arguments[0]);", message);
	    }

	    // Refreshing the page
	    public void refreshPage() {
	        driver.navigate().refresh();
	    }

	    // Scrolling down the page
	    public void scrollDown(int pixels) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, arguments[0]);", pixels);
	    }

	    // Scroll up the page
	    public void scrollUp(int pixels) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, -arguments[0]);", pixels);
	    }

	    // Zoom-In page
	    public void zoomIn() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("document.body.style.zoom='150%';");
	    }

	    // Zoom-Out page
	    public void zoomOut() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("document.body.style.zoom='100%';");
	    }
	



	public static void main(String[] args) throws InterruptedException {			


	}

}
