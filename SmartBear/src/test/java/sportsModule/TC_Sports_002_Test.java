package sportsModule;



import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;



public class TC_Sports_002_Test extends Basedata {
	@Test
	public void sportsCategory() {
		
		PomRepoForSmartBear basePage = new PomRepoForSmartBear(driver);
		WebElement sportdrop = basePage.getSportsDropDown();
		sportdrop.click();
		basePage.getBasketballButton().click();		
		basePage.getPrice();
		Reporter.log(basePage.getPrice().getText(), true);
		basePage.getPrice1().click();
		
	}
}
