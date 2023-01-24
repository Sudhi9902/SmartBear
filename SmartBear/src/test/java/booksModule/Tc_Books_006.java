package booksModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;

public class Tc_Books_006 extends Basedata {
	@Test
	public void clickOnSortByAndSelect() throws InterruptedException {
		PomRepoForSmartBear b1=new PomRepoForSmartBear(driver);
		b1.getSortBy().click();
		Thread.sleep(1000);
		b1.getFeautured().click();
		Reporter.log("succesfully selected");
	}

}
