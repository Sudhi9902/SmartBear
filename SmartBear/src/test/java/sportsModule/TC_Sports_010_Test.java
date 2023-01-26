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

public class TC_Sports_010_Test extends Basedata{
	@Test
	public void aboutUsButton() {
		PomRepoForSmartBear basePage=new PomRepoForSmartBear(driver);
		basePage.getHelp_ServicesButton().click();
		basePage.getAboutUsButton().click();
		Reporter.log("about Us Page",true);
	}
}
