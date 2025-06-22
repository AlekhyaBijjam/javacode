package MavenProject.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirindiaIframe {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.airindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement accept = driver.findElement(By.xpath("(//button[.='Accept All'])[1]"));
		accept.click();
		String s1 = "return document.querySelector(\"#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1)"
				+ " > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-search-trip > div > "
				+ "div.ai-search-trip-type > ai-radio-group\").shadowRoot.querySelector(\"#radio0\")";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement al = (WebElement) js.executeScript(s1);
		Thread.sleep(2000);
		al.click();

	}

}
