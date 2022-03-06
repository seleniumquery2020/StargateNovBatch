package seleniumBasicFundamental;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleExample {

	
static WebDriver driver;
	
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.naukri.com/");
		 String s = driver.getWindowHandle();
		 System.out.println(s);
		 
		 driver.findElement(By.cssSelector("a[title='Search Jobs']")).click();
		 
		Set<String> window = driver.getWindowHandles();
		
		System.out.println(window);
		
		System.out.println("Title = "+driver.getTitle());
		
		Iterator<String> itr = window.iterator();
		
		while(itr.hasNext()) {
			String win = itr.next();
			
			if(!win.equals(s)) 
				driver.switchTo().window(win);
			
		}
		
		System.out.println("Title = "+driver.getTitle());
		
		//driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) {
		launchBrowser();
	}
}
