package texts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

public class chrome extends pass
{
	public static WebDriver wd;
	@BeforeSuite
	public void chrome()
	{
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("headless");
        options.addArguments("window-size=1200x600");
		
        wd = new ChromeDriver();
	}
}
