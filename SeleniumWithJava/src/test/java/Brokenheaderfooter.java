
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Brokenheaderfooter {
	 public static void main(String[] args) throws InterruptedException{
		 System.setProperty("webdriver.gecko.driver", "D:\\Selinium Drivers\\Exe Files\\geckodriver\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.navigate().to("http://www.google.com/");  // Use navigate instead of driver.get()

	WebElement footer= driver.findElement(By.xpath("//div[@id='footer']"));  // Get Footer element which contains all footer links
	  System.out.println(footer.findElements(By.tagName("a")).size()) ;
	  List<WebElement> footlinks = footer.findElements(By.tagName("a"));
	  int i = footer.findElements(By.tagName("a")).size(); //Get number of links

	  for(int j = 0;j<i;j++){    //create loop based upon number of links to traverse all links
	   footer= driver.findElement(By.xpath("//div[@id='footer']"));   // We are re-creating "footer" webelement as DOM changes after navigate.back()
	   footer.findElements(By.tagName("a")).get(j).getText();
	   footer.findElements(By.tagName("a")).get(j).click();
	      Thread.sleep(3000);
	   System.out.println(driver.getTitle());
	      if(driver.getTitle().contains("404")) {
	       System.out.println("404 Found");
	      }
	      driver.navigate().back();
	   Thread.sleep(4000);
	  }
	 }
	

}
