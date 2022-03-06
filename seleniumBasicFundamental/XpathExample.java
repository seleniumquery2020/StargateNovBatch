package seleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://admin-demo.nopcommerce.com/login?returnurl=%2Fadmin%2F");
	}

	/*
	 * public static void getHeaders() {
	 * 
	 * String title = driver.findElement(By.xpath("//h1")).getText();
	 * 
	 * String welcomeMsg = driver.findElement(By.xpath("//strong")).getText();
	 * System.out.println("Title = " + title);
	 * 
	 * if (title.equals("Admin Area Demo")) { System.out.println("Test Passed : " +
	 * title + " is same as expected"); } else { System.err.println("Test Failed : "
	 * + title + " is not same as expected");
	 * 
	 * } System.out.println("Welcome Message = " + welcomeMsg);
	 * 
	 * WebElement usernameField =
	 * driver.findElement(By.xpath("//input[@id='Email']")); usernameField.clear();
	 * usernameField.sendKeys("user@yourStore.in");
	 * 
	 * WebElement passwordField = driver.findElement(By.xpath("(//input)[2]"));
	 * passwordField.clear(); passwordField.sendKeys("Admin");
	 * 
	 * System.out.println(driver.findElement(By.
	 * xpath("//div[@class='inputs reversed']/label")).getText()); }
	 */

	public static void getheader()
	{
	driver.get("https://www.flipkart.com");
	String str = driver.getWindowHandle();
	System.out.println(str);
	System.out.println(driver.getTitle());

	WebElement search = driver.findElement(By.tagName("input"));
	search.sendKeys("SAMSUNG Galaxy S21 FE 5G");

	try {
	Thread.sleep(5000);
	} catch (InterruptedException e) {
	}

	driver.findElement(By.tagName("button")).click();

	try {
	Thread.sleep(5000);
	} catch (InterruptedException e) {

	}

	driver.findElement(By.className("_1fQZEK")).click();
	//driver.findElement(By.className("._4rR01T")).click();

	//driver.findElement(By.linkText("SAMSUNG Galaxy S21 FE 5G (Graphite, 128 GB)")).click();
	//driver.findElement(By.cssSelector("a[class='_1fQZEK']")).click();

	// driver.findElement(By.cssSelector("div[class*='_4rR01T']")).click();

	}
	
	public static void main(String[] args) {
		launchBrowser();
		getheader();
	}
}
