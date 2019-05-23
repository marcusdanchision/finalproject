package texts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class read extends chrome
{
	public static String equation = "";
	
	@Test
	public void read()
	{	 
		 while(true)
		 {
			 String emailss = "";
			 try
			 {
				 String ee = wd.findElement(By.className("bog")).getText();
				 emailss = ee;
			 }
			 catch(Exception noemails){}
			 
			try 
			{
				TimeUnit.NANOSECONDS.sleep(1);
			} catch (InterruptedException e) {}
			 
			 if(emailss.equals("(no subject)"))
			 {
				 equation = wd.findElement(By.className("y2")).getText();
				 break;
			 }
		 }//end loop	
	}
}
