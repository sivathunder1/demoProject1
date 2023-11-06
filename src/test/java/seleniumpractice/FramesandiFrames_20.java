package seleniumpractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.httpclient.HttpConnection;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FramesandiFrames_20 {

	WebDriver driver = new ChromeDriver();
	


	
	@Test
	public void frames() throws InterruptedException, IOException {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//WebDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("Name of the frame");
		driver.findElement(By.id("element")).click();
		driver.switchTo().defaultContent();//Switches to default content
		
		driver.switchTo().frame("Element of the frame");
		driver.findElement(By.id("element")).click();
		
		driver.switchTo().frame("Index of the frame");
		driver.findElement(By.id("element")).click();		
		
		Thread.sleep(3000);

		driver.quit();

	}
	
	public void innerIframes() throws InterruptedException, IOException {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//WebDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("Name of the frame");
		WebElement Frame = driver.findElement(By.id("element"));
		Frame.click();
		//Not necessary to switch to default content
		
		WebElement outerFrame = driver.findElement(By.id("element"));
		driver.switchTo().frame(outerFrame);
		driver.findElement(By.id("element of outer iframe")).click();
		
		WebElement innerFrame = driver.findElement(By.id("element"));
		driver.switchTo().frame(innerFrame);
		driver.findElement(By.id("element of outer iframe")).click();	
		
		//here use the parent frame
		driver.switchTo().parentFrame();
		
		
		Thread.sleep(3000);

		driver.quit();

	}
	


	public static void main(String[] args) throws InterruptedException {			


	}

}
