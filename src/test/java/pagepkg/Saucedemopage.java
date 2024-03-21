package pagepkg;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemopage {
	WebDriver driver;
@FindBy(id="user-name")
WebElement userr;
@FindBy(xpath="//*[@id=\"password\"]")
WebElement pass;
@FindBy(xpath="//*[@id=\"login-button\"]")
WebElement login;

@FindBy(xpath="//*[@id=\"item_4_img_link\"]/img")
WebElement img;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
WebElement cart;
@FindBy(xpath="//*[@id=\"back-to-products\"]")
WebElement back;

@FindBy(xpath="//*[@id=\"item_0_img_link\"]/img")
WebElement img2;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
WebElement cart2;

@FindBy(xpath="//*[@id=\"item_1_img_link\"]/img")
WebElement img3;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
WebElement cart3;

@FindBy(xpath="//*[@id=\"item_5_img_link\"]/img")
WebElement img4;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
WebElement cart4;

@FindBy(xpath="//*[@id=\"item_2_img_link\"]/img")
WebElement img5;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
WebElement cart5;

@FindBy(xpath="//*[@id=\"item_3_img_link\"]/img")
WebElement img6;
@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
WebElement cart6;

@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
WebElement maincart;

@FindBy(xpath="//*[@id=\"checkout\"]")
WebElement checkout;
@FindBy(xpath="//*[@id=\"first-name\"]")
WebElement firstname;
@FindBy(xpath="//*[@id=\"last-name\"]")
WebElement lastname;
@FindBy(xpath="//*[@id=\"postal-code\"]")
WebElement code;
@FindBy(xpath="//*[@id=\"continue\"]")
WebElement conti;
@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
WebElement threeline;
@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
WebElement logouts;


public Saucedemopage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void clickloginn() {
	login.click();
}
public void setvaluess(String username,String password) {
	userr.sendKeys(username);
	pass.sendKeys(password);
}
public void imgone() {
	img.click();
	cart.click();
	back.click();
	}
public void imgtwo() {
	img2.click();
	cart2.click();
	back.click();
}
public void imgthree() {
	img3.click();
	cart3.click();
	back.click();
}
public void imgfour() {
	img4.click();
	cart4.click();
	back.click();
}
public void imgfive() {
	img5.click();
	cart5.click();
	back.click();
}
public void imgsix() {
	img6.click();
	cart6.click();
	back.click();
}
public void carts() {
	maincart.click();
	
}
public void down() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)", "");
}
public void checkouts() {
	checkout.click();
	firstname.sendKeys("vaishnavi");
	lastname.sendKeys("dileep");
	code.sendKeys("686563");
	conti.click();
}
public void homepage() {
	String currentwindow=driver.getWindowHandle();
	System.out.println(driver.getTitle());
	Set<String>allwindow=driver.getWindowHandles();
	for(String handle:allwindow) {
		if(!handle.equalsIgnoreCase(currentwindow)) {
			driver.switchTo().window(handle);
			driver.close();
			
		}
		driver.switchTo().window(currentwindow);
	}
	
}
public void threeline() {
	threeline.click();
	
}
public void log() {
	logouts.click();
}

}
