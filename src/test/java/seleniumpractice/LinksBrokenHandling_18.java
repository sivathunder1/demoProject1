package seleniumpractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.httpclient.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksBrokenHandling_18 {

	WebDriver driver = new ChromeDriver();

	@Test
	public void sortedDropdown() throws InterruptedException, IOException {
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		//WebElement bestSellerLink =  driver.findElement(By.linkText("Best Sellers"));
		WebElement bestSellerLink =  driver.findElement(By.partialLinkText("Best Sellers"));
		bestSellerLink.click();
		
		//Capturing all the available links
		List<WebElement> allAvailableLinks =  driver.findElements(By.tagName("a"));
		int totalLinksNo = allAvailableLinks.size();
		System.out.println("Total available links : " + totalLinksNo);
		
		for(WebElement total:allAvailableLinks) {
			String totallinks = total.getText();			
			System.out.println("The links : " + totallinks);
			
		}
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		
		for(WebElement total:allAvailableLinks) {
			String totallinksHref = total.getAttribute("href");
			System.out.println("The links with HREF: " + totallinksHref);
			
		}
		
		//Broken links
		int brokenLinks = 0;
		int normalLinks = 0;
		for(WebElement total:allAvailableLinks) {
			String totallinksHref = total.getAttribute("href");
			
			if(totallinksHref == null || totallinksHref.isEmpty() ) {
				System.out.println("URL is empty :");
				continue;
			}
			URL link = new URL(totallinksHref);
			try {
			HttpURLConnection connect = (HttpURLConnection)link.openConnection();
			connect.connect();
			if(connect.getResponseCode()>400) {
				System.out.println("Broken Links : " + connect.getResponseCode());
				brokenLinks++;
			}else {
				System.out.println("Normal Links : " + connect.getResponseCode());
				normalLinks++;
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		Thread.sleep(5000);

		driver.quit();

	}
	


	public static void main(String[] args) throws InterruptedException {			


	}

}
