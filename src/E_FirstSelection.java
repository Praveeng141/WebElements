import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E_FirstSelection {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neelima\\Desktop\\Selenium Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		Select dropdown = new Select(driver.findElement(By.className("_5dba")));
		dropdown.selectByIndex(5);
		//WebElement option=dropdown.getFirstSelectedOption();
		//System.out.println(option.getText());
        
	}

}
