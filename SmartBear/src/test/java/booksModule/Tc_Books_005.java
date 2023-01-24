package booksModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;

public class Tc_Books_005 extends Basedata{
	@Test
	public void ToSelectpriceButton() {
		PomRepoForSmartBear b1=new PomRepoForSmartBear(driver);
		b1.getPrice10().click();
		Reporter.log("clicked");
	}

}
