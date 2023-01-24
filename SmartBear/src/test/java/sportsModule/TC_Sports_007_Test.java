package sportsModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;

public class TC_Sports_007_Test extends Basedata{
	@Test
	public void addToCart() {
		PomRepoForSmartBear basePage= new PomRepoForSmartBear(driver);
		basePage.getSportsDropDown().click();
		basePage.getSoccerButton().click();
		basePage.getSoccerProduct().click();
		basePage.getIncrementButton().click();
		basePage.getAddCartButton().click();
		Reporter.log("Product Successfully Added To Cart",true);
	}
}
