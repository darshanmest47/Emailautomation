package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ActionsClass;

public class Signin {
	
	private WebDriver driver;
	public ActionsClass acts;

	
	public Signin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		acts = new ActionsClass(driver);
		
		
	}
	
	@FindBy(xpath="//nav/ul/li/a[text()='Sign in']")
	private WebElement signin;
	
	
	public void clickSignin() {

		signin.click();
	}
	

}
