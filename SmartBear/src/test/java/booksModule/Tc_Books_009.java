package booksModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;

public class Tc_Books_009 extends Basedata {
	@Test
	public void clickOnWishList() throws InterruptedException {
		PomRepoForSmartBear b1=new PomRepoForSmartBear(driver);
		b1.getShpngcrt().click();
		b1.getGoingTocart().click();
		Reporter.log("user is able to click on shopping cart button", true);
		
	}
		
	}


