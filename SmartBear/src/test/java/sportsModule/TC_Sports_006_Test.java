package sportsModule;

import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;
/***
 * 
 * @author Chandana
 *
 */

public class TC_Sports_006_Test extends Basedata {
	@Test
	public void soccerButton() {
		PomRepoForSmartBear basePage= new PomRepoForSmartBear(driver);
		basePage.getSportsDropDown().click();
		basePage.getSoccerButton().click();
		basePage.getSortDropDown().click();
		basePage.getSort_Name_A_Z().click();
		basePage.getSoccerProduct().click();
	}
}
