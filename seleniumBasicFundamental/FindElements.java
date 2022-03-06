package seleniumBasicFundamental;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	
	
	static WebDriver driver;
	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");

	}


	 public static void findElementsforSendKeys() {
		 
		 List<WebElement> elements = driver.findElements(By.tagName("input"));
		 System.out.println(elements.size());
		 
		 elements.get(0).clear();
		 elements.get(0).sendKeys("user@your.com");
		 
		 elements.get(1).clear();
		 elements.get(1).sendKeys("user@123");
		 
		 elements.get(2).click();
	 }
	 
	 
	 public static void main(String[] args) {
		launchBrowser();
		findElementsforSendKeys();
	}
}
