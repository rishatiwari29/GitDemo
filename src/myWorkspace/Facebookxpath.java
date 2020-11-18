package myWorkspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Risha Diary\\\\eclipse-workspace\\\\libs\\\\driver\\\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();	
		driver.get("http://facebook.com");
//identified through chrome		
		
//syntax for xpath- //tagName[@attribute='value']	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("My xpath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("example1");
		driver.findElement(By.xpath("//button[@name='login']")).click();
//		driver.findElement(By.xpath("//*[@name='login']")).click();- it will search for name attribute value as Login under all tags

//syntax for CSS- tagName[attribute='value']
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("My CSS");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("example2");
		driver.findElement(By.cssSelector("button[name='login']")).click();
//		driver.findElement(By.cssSelector("[name='login']")).click();-it will search for name attribute value as Login under all tags
	
//alternate syntax for CSS- tagnname#idvalue	or tagname.classnamevalue
//		driver.findElement(By.cssSelector("input#pass")).sendKeys("example2");
//		driver.findElement(By.cssSelector("#pass")).sendKeys("example2");
		
//lets say we have class="inputtext	
//		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("example2");
	}
	

}
