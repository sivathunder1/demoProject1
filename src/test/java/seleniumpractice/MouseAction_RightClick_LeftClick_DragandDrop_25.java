package seleniumpractice;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseAction_RightClick_LeftClick_DragandDrop_25 {

	WebDriver driver = new ChromeDriver();

	public WebElement waitForElementToBePresent(WebDriver driver, By locator, Duration duration) {

		WebDriverWait wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);		
	}




	@Test
	public void MouseActions() throws InterruptedException, IOException {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//WebDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement rightButton = driver.findElement(By.xpath("//span[text() ='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightButton).build().perform();
		
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		

		WebElement dblClickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(dblClickbutton).build().perform();
		driver.switchTo().alert().accept();		
		
		
		
		driver.navigate().to("https://demo.opencart.com/");
		Thread.sleep(3000);
		WebElement hoverLaptop = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		act.moveToElement(hoverLaptop).build().perform();
		
		
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		Thread.sleep(3000);		
		
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		WebElement drag = driver.findElement(By.xpath("//ul[@id='gallery']//li[1]"));
		findElement(By.xpath("//ul[@id='gallery']//li[1]"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));			
		act.dragAndDrop(drag, drop);

		Thread.sleep(3000);

		driver.quit();

	}
	
	public WebElement findElement(By by) {
	    WebElement elem = driver.findElement(by);
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	    }
	    return elem;
	}



	public static void main(String[] args) throws InterruptedException {			


	}

}
