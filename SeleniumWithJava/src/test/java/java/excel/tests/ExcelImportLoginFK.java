package java.excel.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.server.handler.SendKeys;
//import org.openqa.selenium.firefox.GeckoDriverInfo;

import com.excel.lib.util.Xls_Reader;

public class ExcelImportLoginFK {

	public static void main(String[] args) {

		String SheetName = "login";
		Xls_Reader reader = new Xls_Reader ("./src/test/resources/com/excel/lib/util/SampleExcelLoginData.xlsx");
		System.setProperty("webdriver.gecko.driver", "D:\\Selinium Drivers\\Exe Files\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/account/login");
		driver.manage().window().maximize();
		
		WebElement userName= driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[1]/input"));
		WebElement password=driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[2]/input"));

		int rowCount = reader.getRowCount(SheetName);
		System.out.println("rowCount--" + rowCount);

		int columnCount = reader.getColumnCount(SheetName);
		System.out.println("columnCount--" + columnCount);
		
		for (int rowNo=2;rowNo<=rowCount;rowNo++) {
			String loginId=reader.getCellData(SheetName, "username", rowNo).toString();
			String Password=reader.getCellData(SheetName, "password", rowNo);
			System.out.println("login Details--"+loginId+"||"+Password);
			
			userName.clear();
			userName.sendKeys(loginId);
			password.clear();
			password.sendKeys(Password);
		}
					
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[4]/button")).submit();
		driver.findElement(By.linkText("Fashion")).click();

	}

}
