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
public class TestCase_008_Test extends Basedata {
	@Test
	public void clickOnWishList() throws InterruptedException {
		PomRepoForSmartBear b1 = new PomRepoForSmartBear(driver);
		b1.getBookNavBarButton().click();
		b1.getWish1().click();
		b1.getView().click();
		Reporter.log("succesfully clicked", true);
	}

}
