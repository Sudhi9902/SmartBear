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
public class TC_Books_001_Test extends Basedata {
	@Test
	public void ToclickonSortBy() {
		PomRepoForSmartBear b1 = new PomRepoForSmartBear(driver);
		b1.getBookNavBarButton().click();
		b1.getSortBy().click();
		Reporter.log("clicked", true);
	}

}
