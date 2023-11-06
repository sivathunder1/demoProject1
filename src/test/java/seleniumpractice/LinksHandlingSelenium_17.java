package seleniumpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksHandlingSelenium_17 {

	WebDriver driver = new ChromeDriver();

	@Test
	public void sortedDropdown() throws InterruptedException {
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
		
		Thread.sleep(5000);

		driver.quit();

	}
	


	public static void main(String[] args) throws InterruptedException {			


	}

}
