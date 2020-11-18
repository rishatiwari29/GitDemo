package myWorkspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceRegExp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "C:\\Risha Diary\\eclipse-workspace\\libs\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://rediff.com");
		
//css regex syntax- //tagname[attribute=*'value']			
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
		
//xpath regex syntax- //tagname[contains(@attribute,'value')]		
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		
		driver.close();
		
	}
}