package seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UploadFile_RobotClass_34 {

	WebDriver driver = new ChromeDriver();

	public WebElement waitForElementToBePresent(WebDriver driver, By locator, Duration duration) {

		WebDriverWait wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);		
	}




	@Test
	public void toolTip_MultiWindow_Lcoations() throws InterruptedException, IOException, AWTException {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//WebDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");		
		WebElement uploadButton1 = driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']"));
		highlightElement(driver, uploadButton1, "Yes");
		uploadButton1.click();
		
		WebElement resumeUpload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		//Using Send Keys
		//resumeUpload.sendKeys("C:\\Users\\Siva\\Downloads\\Java Interview questions.pdf");
		//WebElement submitButton = driver.findElement(By.xpath("//input[@id='pop_upload']"));
		
		//Using Robot Class
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",resumeUpload);
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		//put path to file in clipboard
		StringSelection ss = new StringSelection("C:\\Users\\Siva\\Downloads\\Java Interview questions.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//CTRL+V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		//Release of keys event
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//Press Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		
		//Release Enter
		rb.keyRelease(KeyEvent.VK_ENTER);
		
			
				
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
