import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathId 
{
    public static void main(String args[])
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\neelima\\Desktop\\Selenium Files\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.facebook.com");
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("praveeng141@gmail.com");
    	driver.close();
    }
}
