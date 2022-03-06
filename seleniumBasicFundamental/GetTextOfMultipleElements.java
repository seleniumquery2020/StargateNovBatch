package seleniumBasicFundamental;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextOfMultipleElements {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

	}
	public static void findElementsforgetText() {

		List<WebElement> elements = driver.findElements(By.cssSelector("div[class='xtXmba']"));
		System.out.println(elements.size());

		/*
		 * for (int i = 0;i<elements.size();i++) {
		 * System.out.println(elements.get(i).getText()); }		 */

		Iterator<WebElement> itr = elements.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
	}

	public static void main(String[] args) {

		launchBrowser();
		findElementsforgetText();
	}

}