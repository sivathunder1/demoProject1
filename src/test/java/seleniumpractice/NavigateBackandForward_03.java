package seleniumpractice;

import java.security.AlgorithmConstraints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NavigateBackandForward_03 {
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void getTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);		
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//Get method will wait until page load
		//navigate will not wait for pageload and use browser cookies
		
		
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}
	
//	@AfterClass
//	public void driverQuit() {
//		
//	}
//	
	public static void main(String[] args) throws InterruptedException {			
		
		
	}

}
