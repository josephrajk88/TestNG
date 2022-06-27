import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserLaunch {

	public void browserFactory(String browsername) throws InterruptedException {

		WebDriver driver = null;

		switch (browsername) {

		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "FireFox":
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		case "Edge":
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please provide correct browser name");
			break;
		}

		driver.get("https://www.google.com/");

		String title = driver.getTitle();

		if (title.equals("Google")) {
			System.out.println(title + " is matched. Test Case Passed");
		} else {
			System.out.println(title + " is not matched. Test Case Failed");

		}

		String url = driver.getCurrentUrl();

		if (url.equals("https://www.google.com/")) {
			System.out.println(url + " is matched. Test Case Passed");
		} else {
			System.out.println(url + " is not matched. Test Case Failed");
		}

		driver.manage().window().maximize(); // Window maximize

		Thread.sleep(4000);
		System.out.println(browsername + " is launched Successfully!");
		
 // Close Vs Quit Difference
		// driver.close();
		driver.quit();

		System.out.println("Take Care! Bye!");
	}

	public static void main(String[] args) throws InterruptedException {

		MultiBrowserLaunch t = new MultiBrowserLaunch();
		t.browserFactory("Chrome");

	}
}
