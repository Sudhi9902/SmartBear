package WishListAndCart;


import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import pomRepo.Repository;

public class TC_002Test extends Basedata{

	
	@Test
	public  void OpenShoppingCart() {
		////////////// /// to check wheather the shopping cart page is opening or not 
		
		 Repository base = new Repository(driver);
		 base.getShoppingcart().click();
		 Reporter.log("Shopping cart displayed Succesfully", true);
	}
}
