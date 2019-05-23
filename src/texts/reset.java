package texts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class reset extends chrome
{
	public void reset()
	{
		try 
		{
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {}
		
		wd.findElement(By.xpath("//*[@id=\":4\"]/div[2]/div[1]/div/div[2]/div[3]")).click();
	}
}
