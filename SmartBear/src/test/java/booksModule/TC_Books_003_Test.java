package booksModule;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;
/***
 * 
 * @author Mujeeb
 *
 */
public class TC_Books_003_Test extends Basedata {
	@Test
	public void ToClickOnBooksPage() {
		String expectedTitle = "Shop. Books";
		PomRepoForSmartBear b3 = new PomRepoForSmartBear(driver);
		b3.getBookNavBarButton().click();
		b3.getBookspge().click();
		Reporter.log("successfully clicked" + driver.getTitle());

		assertEquals(driver.getTitle(), expectedTitle, "user is not able to click on books button");

	}

}
