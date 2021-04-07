package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ActionsClass;

public class Emailpage {
	
	private WebDriver driver;
	public ActionsClass acts;
	WebDriverWait wt;
	
	public Emailpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		acts = new ActionsClass(driver);
		
		
	}
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailButt;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbutt;
	
	public void enterEmail() {
		wt = new WebDriverWait(driver,60);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
		emailButt.sendKeys("darshanmesta47@hotmail.com");
	}
	
	public void buttonClick() {
		submitbutt.click();
	}
	
	

}
