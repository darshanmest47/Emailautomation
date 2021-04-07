package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ActionsClass;

public class Passwordpage {
	
	private WebDriver driver;
	public ActionsClass acts;
	WebDriverWait wt ;
	
	public Passwordpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		acts = new ActionsClass(driver);
		
	}
	
	@FindBy(xpath="//input[@name='passwd']")
	private WebElement passwd;
	
	@FindBy(xpath="//div[@class='inline-block']/input[@id='idSIButton9']")
	private WebElement nextButt;
	

	
	
	public void enterpassword()  {
		wt = new WebDriverWait(driver,60);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inline-block']")));
		
		passwd.sendKeys("Kaki'sbackminnirising");
		
		
	}
	
	public void clickNext() throws InterruptedException{
		Thread.sleep(20000);
		

		try {
			nextButt.click();
		   
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
		nextButt.click();
		}
		
		
	}
	
	

}
