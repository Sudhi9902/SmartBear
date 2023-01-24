package booksModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;

public class Tc_Books_002 extends Basedata {
	@Test
	public void clickonBestSellers()  {
		PomRepoForSmartBear b2=new PomRepoForSmartBear(driver);
		b2.getBestsellerpge().click();
		Reporter.log("clicked",true);
			
			
		}
		
	}




