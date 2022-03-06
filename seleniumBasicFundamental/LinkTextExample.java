package seleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextExample {

static WebDriver driver;
	
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		driver.findElement(By.partialLinkText("Create a")).click();
	}
	public static void main(String[] args) {
		launchBrowser();
	}
}
