package WishListAndCart;


import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import pomRepo.Repository;
/***
 * 
 * @author Raghav
 *
 */


public class TC_001Test extends Basedata {
	/// to check wheather the wishlist page is opening or not 

	@Test

	public void OpenWishlist() {


		Repository base = new Repository(driver);
		base.getWishlist().click();
		driver.findElement(By.linkText("View Wishlist")).click();
		Reporter.log("wishlist opned succesfully", true);








	}
}
