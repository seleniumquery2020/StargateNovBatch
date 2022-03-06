package seleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindWebElement {
	
	static WebDriver driver;
	
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
	}

	public static void getHeaderOfPage() throws InterruptedException {
		
		WebElement element = driver.findElement(By.tagName("h1"));
		String text = element.getText();
		System.out.println(text);
		element.click();
		
		System.out.println("Page header is present "+element.isDisplayed());
		
		WebElement emailField = driver.findElement(By.id("Email"));
		emailField.clear();
		Thread.sleep(5000);
		emailField.sendKeys("admin@yourstore.com");
		
		WebElement passwordField = driver.findElement(By.name("Password"));
		passwordField.clear();
		passwordField.sendKeys("admin");
	
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(15000);
		driver.findElement(By.className("nav-link")).click();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		getHeaderOfPage();
	}
	
	
}
