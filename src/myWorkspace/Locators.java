package myWorkspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Risha Diary\\\\eclipse-workspace\\\\libs\\\\driver\\\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
//************Facebook Login***********************		
//		driver.get("http://facebook.com");
//		Thread.sleep(4000);
//		
//		driver.findElement(By.id("email")).sendKeys("rishatiwari29@gmail.com");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("pass")).sendKeys("Password123!");
//		Thread.sleep(2000);
//		
////		driver.findElement(By.id("u_0_b")).click(); //here id is alphanumeric and might change at every refresh. Hence not suggested to use.
////		Thread.sleep(2000);
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		Thread.sleep(4000);
//		driver.close();
		
//************Salesforce Login**********************
//When we are identifying with classname attribute and and if the value has spaces then we cannot use it because it will give an error
//Error- "Compound Class name not permitted"
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
//		driver.findElement(By.className("button r4 wide primary")); //Give error		

//******Get xpath from browser by default***************
//		1.Inspect the element
//		2.Right click on the highlighted element
//		3.Copy-Copy xpath
//		xpath-//*[@id="Login"]
//		css selector- #Login
//point to remember-remove the double quotes from above xpath and then give.
//					Also if xapth starts with html, it is not relaible.avoid using that
		
//Similarly we can get CSS locator by following above way.		
		driver.findElement(By.xpath("//*[@id='Login']")).click();
//		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());		
		driver.close();
		
//There is no direct way to get CSS in chrome. We have to get it from toolbar

//To validate xpath/Css do the following
//1. copy xpath
//Go to console.Prefix xpath with $x and give enter
//		$x("//*[@id='forgot_password_link']")
		
//For css just prefix with $
//		$("#mydomainLink")
	}

}
