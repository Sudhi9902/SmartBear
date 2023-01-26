package sportsModule;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;
/***
 * 
 * @author Chandana
 *
 */
public class TC_Sports_003_Test extends Basedata {
	@Test
	public void sortbyrelevancedropdown() throws InterruptedException {
		PomRepoForSmartBear basePage = new PomRepoForSmartBear(driver);
		basePage.getSportsDropDown().click();
		Reporter.log("user clicked on Sport DropDown",true);
		basePage.getBasketballButton().click();
		Reporter.log("user clicked on BasketBall Button",true);
		WebElement sort = basePage.getSortDropDown();
		sort.click();
		//explicity.until(ExpectedConditions.invisibilityOf(sort));
		Reporter.log("user clicked on Sort By DropDown",true);
		basePage.getSort_Name_A_Z().click();
		Reporter.log("user clicked on Sort By Name:A to Z",true);
	}
}
