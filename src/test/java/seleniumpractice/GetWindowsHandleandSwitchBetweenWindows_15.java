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

public class GetWindowsHandleandSwitchBetweenWindows_15 {

	WebDriver driver = new ChromeDriver();

	@Test
	public void sortedDropdown() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String windowID = driver.getWindowHandle();
		System.out.println("This will give handle of single Window ID : "+windowID);
		
		Thread.sleep(5000);
		WebElement linkOrange = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		linkOrange.click();
		
		Set<String>windowIds =  driver.getWindowHandles();
		
		Iterator<String> windowIdsText = windowIds.iterator();
		
		String parentID = windowIdsText.next();
		String childID = windowIdsText.next();
		
		System.out.println("Parent Browser ID : "+parentID);
		System.out.println("Child Browser ID : "+childID);
		
		List<String> windowIdsList = new ArrayList<String>(windowIds);
		
		String parentIDList = windowIdsList.get(0);
		String childIDList = windowIdsList.get(1);
		
		System.out.println("Handles by using List : " + parentIDList);
		System.out.println("Handles by using List : " + childIDList);
		
		driver.switchTo().window(parentIDList);
		System.out.println("Tile of parent window : " +driver.getTitle());
		
		
		driver.switchTo().window(childIDList);
		System.out.println("Tile of Child window : " +driver.getTitle());
		
		for(String ids : windowIdsList) {
			System.out.println(ids);
		}
		
		for(String ids : windowIdsList) {
			String title = driver.switchTo().window(ids).getTitle();
			System.out.println(title);
		}
		
		
		
		for(String ids : windowIdsList) {
			String title = driver.switchTo().window(ids).getTitle();
			if(title.equals("OrangeHRM HR Software | OrangeHRM")) {
				driver.close();
			}
		}
		
				
		
		Thread.sleep(5000);

		driver.quit();

	}
	


	public static void main(String[] args) throws InterruptedException {			


	}

}
