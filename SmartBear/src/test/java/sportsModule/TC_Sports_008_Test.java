package sportsModule;
import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;
/***
 * 
 * @author Chandana
 *
 */

public class TC_Sports_008_Test extends Basedata {
	@Test
	public void removeButton() {
		
		PomRepoForSmartBear basePage = new PomRepoForSmartBear(driver);
		basePage.getSportsDropDown().click();
		basePage.getBasketballButton().click();
		basePage.getBasketBallProduct().click();
		basePage.getAddCartButton().click();
		basePage.getRemoveButton().click();
		Reporter.log("Product is Removed From Cart",true);
		driver.navigate().back();
		
		
		
	}
}
