package booksModule;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;

public class Tc_Books_003 extends Basedata {
	@Test
	public void ToClickOnBooksPage() {
		String expectedTitle="Shop. Books";
		PomRepoForSmartBear b3=new PomRepoForSmartBear(driver);
		b3.getBookspge().click();
		Reporter.log("successfully clicked"+driver.getTitle());
		
		assertEquals(driver.getTitle(), expectedTitle, "user is not able to click on books button");
		
	}

}
