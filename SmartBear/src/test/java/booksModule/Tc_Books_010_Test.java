package booksModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;
/***
 * 
 * @author Mujeeb
 *
 */
public class Tc_Books_010_Test extends Basedata {
	@Test
	public void clickOnWishList() throws InterruptedException {
		PomRepoForSmartBear b1 = new PomRepoForSmartBear(driver);
		b1.getEmailTextBox().click();
		b1.getForums().click();
		Reporter.log("user is able to click on forums", true);

	}
}
