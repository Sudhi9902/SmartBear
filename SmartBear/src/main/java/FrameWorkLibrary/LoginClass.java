package FrameWorkLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginClass {
	public WebDriver driver;
	public Actions actions;
	public WebDriverWait explicitWait;
	
	@BeforeClass
	public void browserSetUp(@Optional("chrome") String bname) {
		//Step:1: Launching a browser
		
		/*ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");*/
		if(bname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			Reporter.log("Empty chrome browser is launched succesfully",true);
		}
		else if (bname.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
			Reporter.log("Empty Edge browser is launched succesully",true);	
		}
		else if (bname.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		Reporter.log("Empty FireFox Browser is launched Successfully", true);
		}
		 else if (bname.equalsIgnoreCase("opera")) {
				WebDriverManager.operadriver().setup();
				driver = new OperaDriver();
				Reporter.log("Empty Opera Browser is launched Successfully", true);
			} else {
				throw new InvalidBrowserValueException();
			}
		//else {
			//throw new InvalidBrowserValueException();
	//}
		driver.manage().window().maximize();
		Reporter.log("Browser window is maximised");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://services.smartbear.com/samples/TestComplete14/smartstore/login?returnUrl=%2Fsamples%2FTestComplete14%2Fsmartstore%2F");
	}
	@AfterClass(alwaysRun = true)
	public void browserTermination() {
		driver.quit();
	}
	
}
class InvalidBrowserValueException extends RuntimeException {
	InvalidBrowserValueException() {
		super("Invalid Browser value is passed");
	}

}
