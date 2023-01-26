package WishListAndCart;


import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import pomRepo.Repository;
/***
 * 
 * @author Raghav
 *
 */
public class TC_002Test extends Basedata{

	
	@Test
	public  void OpenShoppingCart() {
		////////////// /// to check wheather the shopping cart page is opening or not 
		
		 Repository base = new Repository(driver);
		 base.getShoppingcart().click();
		 base.getGotoCart().click();
		 Reporter.log("Shopping cart displayed Succesfully", true);
	}
}
