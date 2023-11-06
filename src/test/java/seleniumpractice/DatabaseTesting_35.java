package seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DatabaseTesting_35 {

	WebDriver driver = new ChromeDriver();

	public WebElement waitForElementToBePresent(WebDriver driver, By locator, Duration duration) {

		WebDriverWait wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);		
	}




	@Test
	public void toolTip_MultiWindow_Lcoations() throws InterruptedException, IOException, AWTException, SQLException {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//WebDriver driver1 = new ChromeDriver();
		String firstName = "Sivaram";
		String lastName = "Sivaram";
		String email = "Sivaram";
		String phone = "Sivaram";
		String password = "Sivaram";
		String terms = "Sivaram";
		
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");		
		driver.findElement(By.name("userName")).sendKeys(firstName);
		driver.findElement(By.name("lastName")).sendKeys(lastName);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirm")).sendKeys(password);
		driver.findElement(By.name("agree")).sendKeys(terms);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openshop","root","");
		Statement stmt = con.createStatement();
		String query = "select firstname, lastname, email, telephone from oc_customer";
		
		ResultSet rs =  stmt.executeQuery(query);
		
		while(rs.next()) {
			String firstNames = rs.getString("firstname");
			String lastNames = rs.getString("firstname");
			String emails = rs.getString("firstname");
			String telephones = rs.getString("firstname");
			
			boolean status = false;
			
			if(firstName.equalsIgnoreCase(firstNames)&& lastName.equalsIgnoreCase(lastNames)
					&& email.equalsIgnoreCase(emails)
					&& phone.equalsIgnoreCase(telephones)) {
				System.out.println("Records found in the table -- Test is passed");
				status = true;
				break;
			}
			
			if(status == false) {
				System.out.println("Records not found");
			}
				
		}
			
				
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
