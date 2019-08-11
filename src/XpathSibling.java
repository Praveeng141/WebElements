import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSibling 
{
	 public static void main(String args[])
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\neelima\\Desktop\\Selenium Files\\chromedriver.exe");
	    	WebDriver driver=new ChromeDriver();
	    	driver.get("https://www.facebook.com");
	    	driver.findElement(By.xpath("//*[contains(@id,'u_0_11')]/preceding::input[1]")).sendKeys("praveen");
	    	driver.navigate().to("https://www.google.com");
	    	String st=driver.getTitle();
	    	System.out.println(st);
	    	driver.close();
	    }
}
