package seleniumBasicFundamental;

import org.openqa.selenium.Point;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {

	static WebDriver driver;
	
	public static void chromeLaunch() throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\java video\\Testing Data\\WebDrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 String title =  driver.getTitle();
		 System.out.println("Title of application = "+title);
		 String url = driver.getCurrentUrl();
		 System.out.println("Url of application = "+url);
		 /*System.out.println(driver.manage().getCookies());
		 
		 driver.manage().deleteAllCookies();
		 
		 System.out.println(driver.manage().getCookies());*/
		 
		// driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		/* System.out.println(driver.manage().window().getPosition());
		 System.out.println(driver.manage().window().getSize());
		
		 Point point = new Point(150, 100);
		 driver.manage().window().setPosition(point);
		 
		 Dimension dim = new Dimension(0, 0);
		 driver.manage().window().setSize(dim);*/
		
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		 URL url1 = new URL("https://www.amazon.com/");
		 driver.navigate().to(url1);
		
		 driver.navigate().back();
		 
		 driver.navigate().forward();
		 
		 driver.navigate().refresh();
		 
		
		
	}
	
	
	public static void ieLaunch() {
		
		System.setProperty("webdriver.ie.driver","E:\\java video\\Testing Data\\WebDrivers\\IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
		 driver.get("https://www.google.com/");
		 String title =  driver.getTitle();
		 System.out.println("Title of application = "+title);
		 String url = driver.getCurrentUrl();
		 System.out.println("Url of application = "+title);
		 driver.close();
	}
	
   public static void fireFoxLaunch() {
		
		System.setProperty("webdriver.gecko.driver","E:\\java video\\Testing Data\\WebDrivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("https://www.google.com/");
		 String title =  driver.getTitle();
		 System.out.println("Title of application = "+title);
		 driver.close();
	}

	public static void main(String[] args) throws MalformedURLException {
		
		chromeLaunch();
		
		//ieLaunch();
		//fireFoxLaunch();
	}
}
