package sportsModule;



import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;



public class TC_Sports_004_Test extends Basedata{
	@Test
	public void Showbutton() {
		PomRepoForSmartBear basePage = new PomRepoForSmartBear(driver);
		basePage.getSportsDropDown().click();
		Reporter.log("user clicked on Sport DropDown",true);
		basePage.getBasketballButton().click();
		Reporter.log("user clicked on BasketBall Button",true);
		basePage.getShowButton().click();
	}
}