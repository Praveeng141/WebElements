import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClassName 
{
    public static void main(String args[])
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\neelima\\Desktop\\Selenium Files\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.facebook.com");
    	driver.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("praveeng141@gmail.com");
    	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("PRA9573@");
    	driver.findElement(By.xpath("//input[@id='u_0_3']")).click();
    	driver.close();
    }
}
