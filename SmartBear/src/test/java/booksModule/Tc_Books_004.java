package booksModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;

public class Tc_Books_004 extends Basedata {
	@Test
	public void getCookandenjoyElmnt() {
		PomRepoForSmartBear b1=new PomRepoForSmartBear(driver);
		b1.getCookandenjoyElmnt().click();
		Reporter.log("clicked",true);

}
}
