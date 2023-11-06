package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetCommands_01 {
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void getTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en");
		String title = driver.getTitle();
		System.out.println("Title of the application "+title);		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(title, "Free and open-source eCommerce platform. ASP.NET Core based shopping cart. - nopCommerce","Check the assertion");		
		Thread.sleep(5000);
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL : "+currentURL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);		
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
