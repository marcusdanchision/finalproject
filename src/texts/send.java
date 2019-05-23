package texts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class send extends convert
{
	public void send()
	{
		wd.findElement(By.className("bog")).click();
		
		WebElement waitforemail = (new WebDriverWait(wd, 5000))
				.until(ExpectedConditions.presenceOfElementLocated(By.className("aSI")));
		
		wd.findElement(By.cssSelector("span[class='ams bkH']")).click();
		
		WebElement waitfortextbox = (new WebDriverWait(wd, 5000))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[role='textbox']")));
		
		wd.findElement(By.cssSelector("div[role='textbox']")).sendKeys(answer+Keys.COMMAND+Keys.ENTER);
	}
}
