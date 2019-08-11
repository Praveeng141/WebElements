import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLinkClick 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neelima\\Desktop\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launching sample website
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement we=driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]"));
		
		we.click();
		if (driver.getTitle().equals("Facebook – log in or sign up")) {							
            System.out.println("We are back at Facebook's homepage");					
        } else {			
            System.out.println("We are NOT in Facebook's homepage");					
        }		
		driver.close();
		
	}
}
