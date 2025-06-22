package MavenProject.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngPrograme3 {
	
	WebDriver driver;
	@Parameters("browser")
	
	@Test(priority=2)
    public void testcase_logintoflipkart() {
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://grotechminds.com/registration/");
//	driver.manage().window().maximize();
	System.out.println("Test");
    }
	@Test(priority=3 , invocationCount = 3)
	public void login() {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://grotechminds.com/registration/");
		System.out.println("Test only");
		}
	@Test(priority=1)
	public void ready() {
		//if(browserequalsto.equals("Chrome")) {
		driver=new EdgeDriver();
		//driver.get("https://grotechminds.com/registration/");
		System.out.println("BeforeSuite");
	}
	
}