package sportsModule;



import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;


public class TC_Sports_005_Test extends Basedata {
	@Test
	public void golfButton() {
		PomRepoForSmartBear basePage = new PomRepoForSmartBear(driver);
		basePage.getSportsDropDown().click();
		basePage.getGolfButton().click();
		basePage.getPrice();
		basePage.getPrice1().click();
		Reporter.log("user click on Price Drop Down",true);
		basePage.getGolfProduct().click();
		basePage.getAddToListButton().click();
		Reporter.log("user click on Add To list",true);
		driver.navigate().back();
	}
}