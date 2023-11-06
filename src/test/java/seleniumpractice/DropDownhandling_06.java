package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownhandling_06 {

	WebDriver driver = new ChromeDriver();

	@Test
	public void getTest() throws InterruptedException {
		//Find elements will not thrown no such elements exception and returns zero
		//Find element will throw no such elements error 
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement registerButton = driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));
		registerButton.isEnabled();
		registerButton.click();

		WebElement countryDropDown = driver.findElement(By.id("input-country"));

		countryDropDown.isEnabled();

		Select country = new Select(countryDropDown);
		country.selectByVisibleText("India");
		country.selectByValue("15");
		country.selectByIndex(10);

		//Now without using any predefined methods
		List<WebElement> allOptions = country.getOptions();

		for(WebElement option : allOptions) {
			Dimension sizeOfList = option.getSize();
			System.out.println("Size of the list : " + sizeOfList);
			if(option.getText().equals("India")) {
				option.click();
				break;
			}
		}

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
