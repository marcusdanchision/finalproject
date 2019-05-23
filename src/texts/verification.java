package texts;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class verification extends pass
{
	public static WebDriver wd;
	public static WebDriver verify;

	public static void main(String[] args)
	{     
        verify = new ChromeDriver();	
		verify.get("https://www.google.com/gmail/");    
		WebElement waitforemail = (new WebDriverWait(verify, 5000))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId")));
		verify.findElement(By.id("identifierId")).sendKeys("marcusfinalproject");	
		verify.findElement(By.id("identifierNext")).click();	
		WebElement waitforpassword = (new WebDriverWait(verify, 5000))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("passwordNext")));
		verify.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(password);
		verify.findElement(By.id("passwordNext")).click();
		WebElement to = (new WebDriverWait(verify, 5000))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='T-I J-J5-Ji T-I-KE L3']")));
		
		verify.findElement(By.cssSelector("div[class='T-I J-J5-Ji T-I-KE L3']")).click();	
	 	
	 	WebElement waitfrpassword = (new WebDriverWait(verify, 5000))
				.until(ExpectedConditions.presenceOfElementLocated(By.name("subjectbox")));
	 	
		verify.findElement(By.name("subjectbox")).sendKeys("calculator verification");	
		
		try 
		{
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {}
		
		WebElement tooo = (new WebDriverWait(verify, 5000))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='aoD hl']")));
		
		verify.findElement(By.cssSelector("div[class='aoD hl']")).click();
		
		try 
		{
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {}
	 	
		Scanner cell = new Scanner(System.in); //asks user for phone number
		
		System.out.println("Who is your phone provider? | verizon | at&t | tmobile | sprint |"); //asks for cell provider
		String provider = cell.next();
		
		System.out.println("What is your phone number?"); //asks for phone number
		String number = cell.next();
		
		if(provider.equals("verizon"))
		{
			verify.findElement(By.name("to")).sendKeys(number+"@vtext.com");	
		}
		else if(provider.equals("at&t"))
		{
			verify.findElement(By.name("to")).sendKeys(number+"@txt.att.net");	
		}
		else if(provider.equals("tmobile"))
		{
			verify.findElement(By.name("to")).sendKeys(number+"@tmomail.net");	
		}
		else if(provider.equals("sprint"))
		{
			verify.findElement(By.name("to")).sendKeys(number+"@messaging.sprintpcs.com");	
		}
		
		verify.findElement(By.cssSelector("div[aria-label='Message Body']")).sendKeys("your number is now verified, please do not delete this message. Text HELP if you are confused on how to use this program");
	
		try 
		{
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {}
		
		verify.findElement(By.cssSelector("div[aria-label='Message Body']")).sendKeys(""+Keys.COMMAND+Keys.ENTER);
	
		WebElement waitfornewemwil = (new WebDriverWait(verify, 5000))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='T-I J-J5-Ji T-I-KE L3']")));
		
		try 
		{
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {}
		
		verify.close();
	}
}
