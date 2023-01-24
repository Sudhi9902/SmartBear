package booksModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;

public class TestCase_008 extends Basedata {
	@Test
	public void clickOnWishList() throws InterruptedException {
		PomRepoForSmartBear b1=new PomRepoForSmartBear(driver);
		b1.getWish1().click();
		b1.getView().click();
		Reporter.log("succesfully clicked", true);
	}
		
	}


