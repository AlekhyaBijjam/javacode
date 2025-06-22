package MavenProject.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GroTechminds {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement name=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	name.sendKeys("Alekhya");
	WebElement click=driver.findElement(By.id("fname"));
	Thread.sleep(5000);
	Actions a=new Actions(driver);
	a.doubleClick(click).perform();
	System.out.println("Alekhya");
	}
}
