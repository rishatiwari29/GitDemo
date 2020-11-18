package myWorkspace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Risha Diary\\eclipse-workspace\\libs\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());	//get browser title
		
		System.out.println(driver.getCurrentUrl()); //get url 
		
//		System.out.println(driver.getPageSource()); //get page source
		
		driver.get("http://yahoo.com");
		driver.navigate().back();
//		driver.navigate().forward();
		
		driver.close(); //closes the current browser
		
//		driver.quit(); //It closes all the browsers opened by selenium script.
	}

}
