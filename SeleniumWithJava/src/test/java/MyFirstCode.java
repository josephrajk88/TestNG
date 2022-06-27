import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstCode {
	
	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		//WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		//driver.get("https://www.amazon.com/");
		
		String title =driver.getTitle();
		if (title.equals("Google"))
		{
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case failed");
		}
		
		String currentURL =driver.getCurrentUrl();
		if (currentURL.equals("https://www.google.com/"))
		{
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case failed");
		}
	}

}
