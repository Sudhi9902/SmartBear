package booksModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;
/**
 *
 * @author Mujeeb
 *
 */
public class TC_Books_005_Test extends Basedata {
	@Test
	public void ToSelectpriceButton() {
		PomRepoForSmartBear b1 = new PomRepoForSmartBear(driver);
		b1.getBookNavBarButton().click();
		b1.getPrice10().click();
		Reporter.log("clicked");
	}

}
