package seleniumpractice;

import java.security.AlgorithmConstraints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyISDisplayedorNot_02 {
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void getTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement textInputXpath = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println("Display Status of the textInput is displayed: " + textInputXpath.isDisplayed() );
		System.out.println("Display Status of the textInput is enabled: " + textInputXpath.isEnabled());
		System.out.println("Display Status of the radio button is checked: " + radioButton.isSelected());
		
		radioButton.click();
		
		System.out.println("Display Status of the radio button is checked: " + radioButton.isSelected());
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
