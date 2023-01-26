package booksModule;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;
/***
 * 
 * @author Mujeeb
 *
 */
public class TC_Books_008_Test extends Basedata {
	@Test
	public void clickonCompare() throws InterruptedException {
		PomRepoForSmartBear b2 = new PomRepoForSmartBear(driver);
		b2.getBookNavBarButton().click();
		b2.getSportsButton().click();
		b2.getBasketBallProduct().click();
		driver.findElement(By.xpath("(//span[text()='Compare'])[2]")).click();
		b2.getCompare().click();
		Reporter.log("user is able to click on compare page", true);
	}
}
