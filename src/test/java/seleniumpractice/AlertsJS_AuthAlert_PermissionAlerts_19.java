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

public class AlertsJS_AuthAlert_PermissionAlerts_19 {

	WebDriver driver = new ChromeDriver();
	
	public void alertInaPage() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("JavaScript Alerts")).click();
		//button[text()='Click for JS Alert']
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert =driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.sendKeys("Testing 123");
		alert.dismiss();
		
	}


	public void authenticationPopup() throws InterruptedException, IOException {
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);

		driver.quit();

	}
	@Test
	public void permissionPopup() throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver1 = new ChromeDriver(options);
		driver1.manage().window().maximize();
		driver1.get("https://www.redbus.in/");
		Thread.sleep(3000);

		driver1.quit();

	}
	


	public static void main(String[] args) throws InterruptedException {			


	}

}
