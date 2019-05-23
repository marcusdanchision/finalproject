package texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login extends chrome 
{
	public void login()
	{
		wd.get("https://www.google.com/gmail/");    
		WebElement waitforemail = (new WebDriverWait(wd, 5000))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId")));
		wd.findElement(By.id("identifierId")).sendKeys("marcusfinalproject");	
		wd.findElement(By.id("identifierNext")).click();	
		WebElement waitforpassword = (new WebDriverWait(wd, 5000))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("passwordNext")));
		wd.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(password);
		wd.findElement(By.id("passwordNext")).click();
		WebElement to = (new WebDriverWait(wd, 5000))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='T-I J-J5-Ji T-I-KE L3']")));
	}
}
