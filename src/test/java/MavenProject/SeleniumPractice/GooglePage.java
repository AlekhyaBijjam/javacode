package MavenProject.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//textarea[@title='Search']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0]. value='Alekhya'", search);

	}

}
