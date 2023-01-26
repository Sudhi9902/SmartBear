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
public class TC_005Test  extends Basedata{


	/////////////////////////////// Varify that whether user is able to increase the quantity of the product in the wishlist

	@Test
	public void IncreaseProductQTYInWishlist() {

		driver.findElement(By.linkText("Soccer")).click();
		driver.findElement(By.linkText("Trainer Ball")).click();
		driver.findElement(By.linkText("Add to List")).click();
		System.out.println("added to wishlist");

		driver.findElement(By.linkText("View Wishlist")).click();

		Repository base = new Repository(driver);
		base.getWishlist().click();
		base.getIncreaseQtyInWishlist().click();
		Reporter.log("The product is increased in the  wishlist", true);
	}
}

