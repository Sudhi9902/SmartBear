package sportsModule;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import FrameWorkLibrary.PomRepoForSmartBear;
/***
 * 
 * @author Chandana
 *
 */
public class TC_Sports_001_Test extends Basedata {
	@Test
	public void sportsCategory() {
		PomRepoForSmartBear basePage = new PomRepoForSmartBear(driver);
		basePage.getSportsButton().click();
		WebElement dropdown = basePage.getSportsDropDown();
		// explicity.until(ExpectedConditions.visibilityOfAllElements(dropdown));

	}
}
