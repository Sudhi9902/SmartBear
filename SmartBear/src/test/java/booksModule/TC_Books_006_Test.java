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
public class TC_Books_006_Test extends Basedata {
	@Test
	public void clickOnSortByAndSelect() throws InterruptedException {
		PomRepoForSmartBear b1 = new PomRepoForSmartBear(driver);
		b1.getBookNavBarButton().click();
		b1.getSortBy().click();
		Thread.sleep(1000);
		b1.getFeautured().click();
		Reporter.log("succesfully selected");
	}

}
