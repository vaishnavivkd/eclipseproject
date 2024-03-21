package baseurlpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	protected WebDriver driver;
	String url="https://www.saucedemo.com/";
	@BeforeMethod
	public void beforemthd() {
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	

}
