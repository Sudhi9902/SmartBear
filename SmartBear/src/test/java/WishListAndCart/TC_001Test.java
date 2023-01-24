package WishListAndCart;


import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import pomRepo.Repository;



public class TC_001Test extends Basedata {
	/// to check wheather the wishlist page is opening or not 

	@Test

	public void OpenWishlist() {


		Repository base = new Repository(driver);
		base.getWishlist().click();
		Reporter.log("wishlist opned succesfully", true);








	}
}
