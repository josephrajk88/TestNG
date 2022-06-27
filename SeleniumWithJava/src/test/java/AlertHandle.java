import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tnstc.in/home.html");

		driver.manage().window().maximize();

		WebElement ele1 = driver.findElement(By.xpath("//a[@class='btnTxt']"));

		ele1.click();

		Alert al = driver.switchTo().alert();
		String alertText = al.getText();
		System.out.println(alertText);
		Thread.sleep(5000);
		
	/*  Methods
	    al.accept();
		al.dismiss();
		al.equals(alertText);
		al.notify();
		al.notifyAll();
		al.sendKeys(alertText);
		al.toString();
		al.wait();
		al.wait(0);
		al.hashCode();  */

	}
}
