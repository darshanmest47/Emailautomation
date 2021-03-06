package factory;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import configurations.Configreader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	
	
	public static WebDriver driver= null;
	public static Properties prop;
	public static ThreadLocal<WebDriver> tls = new ThreadLocal<WebDriver>();
	
	
	public static Properties initProps() throws IOException {

		prop = Configreader.readConfig();
		return prop;
		
	}
	
	public static WebDriver bowserLaunch(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			tls.set(new ChromeDriver());
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tls.set(new FirefoxDriver());
		}
		
		else if(browser.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
			tls.set(new OperaDriver());
		}
		else {
			System.out.println("Please select among chrome,firefox or opera");
		}
		//returnDriver().get("http://tutorialsninja.com/demo/");");

		returnDriver().get("https://www.outlook.com");
		returnDriver().manage().window().maximize();
		
		return returnDriver();
		
	}
	
	
	public static synchronized WebDriver returnDriver() {
		return tls.get();
	}

}
