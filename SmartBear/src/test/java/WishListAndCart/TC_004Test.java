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
public class TC_004Test  extends Basedata {


	/////////////////////////////// Varify that whether user is able to moove the the product from the wishlist to cart

	@Test
	public void moveProductFromWishlistToCart() {

		driver.findElement(By.linkText("Soccer")).click();
		driver.findElement(By.linkText("Trainer Ball")).click();
		driver.findElement(By.linkText("Add to List")).click();
		System.out.println("added to wishlist");

		driver.findElement(By.linkText("View Wishlist")).click();

		Repository base = new Repository(driver);
		base.getWishlist().click();
		base.getMoovetheProductTocart().click();
		Reporter.log("The product is mooved from wishlist to cart", true);
	}
}

