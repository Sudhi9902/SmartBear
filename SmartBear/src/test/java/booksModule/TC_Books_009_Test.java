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
public class TC_Books_009_Test extends Basedata {
	@Test
	public void clickOnWishList() throws InterruptedException {
		PomRepoForSmartBear b1 = new PomRepoForSmartBear(driver);
		b1.getBookNavBarButton().click();
		b1.getShpngcrt().click();
		b1.getGoingTocart().click();
		Reporter.log("user is able to click on shopping cart button", true);

	}

}
