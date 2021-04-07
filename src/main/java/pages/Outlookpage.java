package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ActionsClass;

public class Outlookpage {
	
	
	private WebDriver driver;
	private ActionsClass acts;
	private boolean flag= false;
	WebDriverWait wt ;
	
	
	public Outlookpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		acts = new ActionsClass(driver);
		
	}
	

 
 @FindBy(xpath = "//span[text()='New message']")
 private WebElement newmsg;
 
 @FindBy(xpath = "//input[@aria-label='To']")
 private WebElement To;
 
 @FindBy(xpath="//button[@aria-label='Send']")
 private WebElement send;
 
 @FindBy(xpath="//span[text()='This message must have at least one recipient.']")
 private WebElement errmsg;
 
 @FindBy(xpath="//input[@aria-label='To']")
 private WebElement tobutton;
 
 @FindBy(xpath="//span[text()='darshan m']")
 private WebElement darshanm;
 
 @FindBy(xpath="//div[contains(@data-id,'Modal')]")
 private WebElement modal;
 
 @FindBy(xpath="//div[contains(@data-id,'Modal')]/div[contains(@class,'ms')]/div/div/div[text()='Missing subject']")
 private WebElement missingsub;
 
 @FindBy(xpath="//div[contains(@data-id,'Modal')]/div[contains(@class,'ms')]/div/div[contains(@class,'inner')]/div[contains(@class,'actions')]/div/span/button[@id='ok-1']")
 private WebElement sendmod;
 
 @FindBy(xpath="//div[contains(@data-id,'Modal')]/div[contains(@class,'ms')]/div/div[contains(@class,'inner')]/div[contains(@class,'actions')]/div/span/button[@id='cancel-0']")
 private WebElement donnotsendmod ;
 
 @FindBy(xpath="//span[text()='Select an item to read']")
 private WebElement seleitemtoread;
 
 @FindBy(xpath="//input[contains(@id,'TextField')]")
 private WebElement subjectfield;
 
 @FindBy(xpath="//div[@aria-label='Message body']")
 private WebElement msgbody;
 
 
 public void clickNewMessage() {
	wt = new WebDriverWait(driver,120);
	 wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='New message']")));
	 newmsg.click();
 }
 

 public void clicksendButton() {
		wt = new WebDriverWait(driver,120);
	 wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='To']")));
	 send.click();
 }
 
 
 public boolean errmsgdisplayed() {
	 
		wt = new WebDriverWait(driver,120);
		 wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='This message must have at least one recipient.']")));
	 
	 return errmsg.isDisplayed();
 }
 
 
 public void enterDataintoTofield() {
		wt = new WebDriverWait(driver,200);
		 wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='To']")));
	 tobutton.sendKeys("dars");
 }
 
 public void clickONDarshanM() {
		wt = new WebDriverWait(driver,120);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='darshan m']")));
		darshanm.click();
 }
 
 public boolean misssubDisp() {
		wt = new WebDriverWait(driver,120);
	 wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@data-id,'Modal')]")));
	 return missingsub.isDisplayed();
 }
 
 public void clickSendModal() {
	 sendmod.click();
	 
 }
 
 public void donotsendModal() {
	 donnotsendmod.click();
 }
 
 public boolean selItemToRead() {
	 return seleitemtoread.isDisplayed();
 }
 
 public void enterSubject() {
	 subjectfield.sendKeys("Hello world");
 }
 
 public void enterBdy() {
	 
	 msgbody.sendKeys("Hello World");
	 
 }
 
 public boolean todISP() {
	 wt = new WebDriverWait(driver,200);
	 wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='To']")));
	 return tobutton.isDisplayed();
 }
 
 
	
	

}
