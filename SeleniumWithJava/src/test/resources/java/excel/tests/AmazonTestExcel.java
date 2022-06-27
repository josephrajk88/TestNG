package java.excel.tests;

import java.util.concurrent.TimeUnit;
import javax.swing.text.Position.Bias;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.excel.lib.util.Xls_Reader;
import org.*;

public class AmazonTestExcel {

	public static void main(String[] args) throws InterruptedException {

		Xls_Reader reader = new Xls_Reader("./src/main/java/com/excel/lib/util/SampleExcelLoginData.xlsx");
		String SheetName = "login";

		int rowCount = reader.getRowCount(SheetName);
		System.out.println("rowCount--" + rowCount);

		int columnCount = reader.getColumnCount(SheetName);
		System.out.println("columnCount--" + columnCount);

		System.setProperty("webdriver.gecko.driver", "D:\\Selinium Drivers\\Exe Files\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();

		Thread.sleep(2000);

		for (int rowNo = 2; rowNo <= rowCount; rowNo++) {

			String loginId = reader.getCellData(SheetName, "username", rowNo);
			String Password = reader.getCellData(SheetName, "password", rowNo);
			System.out.println("login Details--" + loginId + "||" + Password);

			Thread.sleep(2000);
			WebElement userName = driver.findElement(By.id("ap_email"));

			userName.clear();
			userName.sendKeys(loginId);
			driver.findElement(By.id("continue")).click();

			WebElement password = driver.findElement(By.id("ap_password"));
			Thread.sleep(2000);

			password.clear();
			password.sendKeys(Password);
			driver.findElement(By.id("signInSubmit")).submit();
			Thread.sleep(5000);

			String ActualTitle = driver.getTitle();
			System.out.println("ActualTitle--" + ActualTitle);
			String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\");\r\n";

			Assert.assertEquals(ExpectedTitle, ActualTitle);
		{driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/h2")).click();

			driver.navigate().back();
			Thread.sleep(2000);
			// driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[2]/a[13]/span")).click();
			driver.navigate().back();
			driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div[2]/div[2]/div/a[3]")).click();
			System.out.println("Title--" + driver.getTitle());

			driver.navigate().back();
			Thread.sleep(2000);

			driver.navigate().forward();
			Thread.sleep(2000);

			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
			Thread.sleep(2000);
			// driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[2]/a[13]/span")).click();
		
		}
			//driver.close();
		Assert.assertNotEquals (ExpectedTitle, ActualTitle);
		driver.get("//www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_ya_signin%26adgrpid%3D55759171661%26hvpone%3D%26hvptwo%3D%26hvadid%3D294135909733%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D7061427085232205953%26hvqmt%3Db%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9301174%26hvtargid%3Dkwd-298479560553%26hydadcr%3D5840_1738694%26gclid%3DEAIaIQobChMI9OD9habX9AIV0jMrCh3DJQ_yEAAYASAAEgIAJ_D_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		}
	}

	private static boolean PageTitle(String string) {
		// TODO Auto-generated method stub
		return false;
	}
}