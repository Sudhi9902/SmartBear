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
public class TC_Books_002_Test extends Basedata {
	@Test
	public void clickonBestSellers() {
		PomRepoForSmartBear b2 = new PomRepoForSmartBear(driver);
		b2.getBookNavBarButton().click();
		b2.getBestsellerpge().click();
		Reporter.log("clicked", true);

	}

}
