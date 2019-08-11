import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neelima\\Desktop\\Selenium Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		List<WebElement> se=driver.findElements(By.tagName("iframe"));
		
		for(int i=0; i<se.size(); i++)
		{
			driver.switchTo().frame(i);
			int total=driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
			
			driver.switchTo().defaultContent();
		}
		
		driver.close();

	}

}
