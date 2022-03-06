package seleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {

	static WebDriver driver;
	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");

	}

	public static void getheader() {
		
		String header = driver.findElement(By.cssSelector("h1")).getText();
		System.out.println("Header of Page = "+header);
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		
		//CssSelector with ID #Idvalue
		boolean present = driver.findElement(By.cssSelector("#loginForm")).isDisplayed();
		System.out.println("Insta Login form is present = "+present);
		
		// CssSelector with className .classNameValue
		String usernameText= driver.findElement(By.cssSelector("._9nyy2")).getText();
		System.out.println("Insta Login form is present = " + usernameText);

		//CssSelector with TagName and Attribute value tagName[attributeName='AttributeValue']		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin@insta.com");
		
//CssSelector with TagName and Multiple Attribute values tagName[attributeName='AttributeValue'][attributeName='AttributeValue']	
		driver.findElement(By.cssSelector("input[autocorrect='off'][name='password']")).sendKeys("admin@123");
	
		//CssSelector with TagName and partial Attribute value tagName[attributeName*='PartialAttributeValue']
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();
		
		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			
			}
	
		
		
		//CssSelector with parent and child tagName parentTag[Attribute='value'] childTag
		System.out.println("Error Message = "+driver.findElement(By.cssSelector("div[class='eiCW-'] p")).getText());
	}
	
	public static void main(String[] args) {
		
		launchBrowser();
		getheader();
	}
}
