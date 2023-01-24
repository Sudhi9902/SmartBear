package booksModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;

public class Tc_Books_001 extends Basedata{
	@Test
	public void ToclickonSortBy() {
		PomRepoForSmartBear b1 = new PomRepoForSmartBear(driver);
		b1.getSortBy().click();
		Reporter.log("clicked", true);
	}

}
