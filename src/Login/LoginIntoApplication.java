package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginIntoApplication
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://facegenie-ams-school.web.app/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//enter the valid credential into email address field
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testbams@gmail.com");
		
		//enter the valid password into password field
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("facegenie");
		
		//click on the Log In button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(20000);
		
		//click on the Log Out button
		driver.findElement(By.xpath("(//div[@role='button'])[8]")).click();
		Thread.sleep(2000);
		
		//click on the cancel button
		//driver.findElement(By.xpath("(//button[@type='button'])[37]")).click();
		//Thread.sleep(5000);
		
		//click on the ok button
		driver.findElement(By.xpath("(//button[@type='button'])[38]")).click();
		Thread.sleep(2000);
	}
	
	

}
