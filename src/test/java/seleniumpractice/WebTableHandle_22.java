package seleniumpractice;

import java.io.IOException;
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

public class WebTableHandle_22 {

	WebDriver driver = new ChromeDriver();

	public WebElement waitForElementToBePresent(WebDriver driver, By locator, int duration) {

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
		driver.get("https://demo.opencart.com/admin/index.php");

		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.id("input-username")).click();
		driver.findElement(By.id("input-username")).clear();
		driver.findElement(By.id("input-username")).sendKeys("demo");

		driver.findElement(By.id("input-password")).click();
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys("demo");

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();

		driver.findElement(By.xpath("//a[@href='#collapse-4']")).click();
		driver.findElement(By.xpath("//a[text()='Orders']")).click();


		//Find the count of table in text
		String totalNoOfPages = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();		
		System.out.println("Total no of pages : " + totalNoOfPages);

		totalNoOfPages.indexOf("(");
		totalNoOfPages.indexOf("Pages");

		int total = Integer.valueOf(totalNoOfPages.substring(totalNoOfPages.indexOf("(")+1,totalNoOfPages.indexOf("Pages")-1));
		Thread.sleep(1000);
		System.out.println(total);



		for(int p=1; p<=total ;p++) {

			WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			System.out.println("Total number of Active pages  " + activePage.getText());
			activePage.click();

			//table[@class='table table-bordered table-hover']//tbody/tr

			int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
			System.out.println("Rows : " + rows);
			
			String pageNumber = Integer.toString(p+1);
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageNumber+"']")).click();
			
			Thread.sleep(1000);
			for(int r=1; r<=rows;r++) {
				String OrderID = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
				
				if(status.equalsIgnoreCase("pending")) {
				System.out.println("Order ID"+"      "+"CustomerName"+"         "+"Status"); 
				System.out.println(OrderID   +"      "+customerName  +"         "+status);
				}
				Thread.sleep(1000);				
			}
			
			Thread.sleep(500);

		}





		Thread.sleep(3000);

		driver.quit();

	}



	public static void main(String[] args) throws InterruptedException {			


	}

}
