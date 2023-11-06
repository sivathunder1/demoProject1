package seleniumpractice;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebTableHandleDynamic_24 {

	WebDriver driver = new ChromeDriver();
	
	public WebElement waitForElementToBePresent(WebDriver driver, By locator, Duration duration) {
		
		WebDriverWait wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);		
	}
	


	
	@Test
	public void frames() throws InterruptedException, IOException {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//WebDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//How to find a row in a table
		//How to find a column in a table
		//How to find all the data in the table
		//Print release date
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		System.out.println("Toatal number of rows : " + row.size());
		
		List<WebElement> colums = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		System.out.println("Toatal number of rows : " + colums.size());
		
		//Retrive specific row and column data
//		WebElement googleElement = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1]"));
//		String gt = googleElement.getText();
//		System.out.println("Table text : "+gt);
		
		//Retrieve all the element from the table
		for(int r=1; r<=row.size();r++) {
			for(int c=1; c<=colums.size();c++) {
				WebElement tableContent = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td["+c+"]"));
				String data = tableContent.getText();
				System.out.println(data);
			}
		}
		
		
				
		
		Thread.sleep(3000);

		driver.quit();

	}
	


	public static void main(String[] args) throws InterruptedException {			


	}

}
