package sportsModule;



import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;


public class TC_Sports_009_Test extends Basedata{
	@Test
	public void shippingButton() {
		PomRepoForSmartBear basePage =new PomRepoForSmartBear(driver);
		basePage.getSportsDropDown().click();
		basePage.getSoccerButton().click();
		basePage.getTrainerBall().click();
		basePage.getShippingButton().click();
		Reporter.log("Product Shipping",true);
		//basePage.getRemoveButton().click();
		//Reporter.log("Product Shipping",true);
	}
}
