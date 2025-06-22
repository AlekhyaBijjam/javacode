package MavenProject.SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatadrivenTesting {
	

	public static void main(String[] args) throws FileNotFoundException {
		
//		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"//testdata//Myfile");
//		XSSFWorkbook workbook=new XSSFWorkbook();
//		XSSFSheet sheet=workbook.createSheet("Data");		
//XSSFRow row=sheet.createRow(0);
//row.createCell(0).setCellValue("1");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"//testdata//Excel.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet WS=workbook.getSheet(null);
		




	}

}
