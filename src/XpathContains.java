import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains 
{
	 public static void main(String args[])
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\neelima\\Desktop\\Selenium Files\\chromedriver.exe");
	    	WebDriver driver=new ChromeDriver();
	    	driver.get("https://www.facebook.com");
	    	driver.findElement(By.xpath("//*[contains(@class,'inputtext')]")).sendKeys("praveeng141@gmail.com");
	    	driver.close();
	    }
}
