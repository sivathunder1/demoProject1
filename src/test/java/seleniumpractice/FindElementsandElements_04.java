package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FindElementsandElements_04 {

	WebDriver driver = new ChromeDriver();

	@Test
	public void getTest() throws InterruptedException {
		//Find elements will not thrown no such elements exception and returns zero
		//Find element will throw no such elements error 
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		String placeHolderText = searchBox.getAttribute("placeholder");
		System.out.println("Placeholder Text-- "+placeHolderText);
		searchBox.sendKeys("hihi");




		List<WebElement> links =  driver.findElements(By.xpath("//div[@class='footer']//a"));
		for(WebElement ele:links) {
			String link = ele.getText();
			System.out.println(link);		

			if (link.equals("Contact us")) {
				Actions actions = new Actions(driver);
				actions.moveToElement(ele).build().perform();
				Thread.sleep(3000);
				ele.click();
				break; 			
			}

		}
		System.out.println("Total links = "+links.size());

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
