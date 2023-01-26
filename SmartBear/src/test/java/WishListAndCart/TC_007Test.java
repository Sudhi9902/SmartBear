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
public class TC_007Test  extends Basedata {

	@Test
	public void IncreaseProductQTYFromCart() {
		/////////////////////////////// Varify that whether user is able to increase the quantity of the product in the cart

		driver.findElement(By.linkText("Soccer")).click();
		driver.findElement(By.linkText("Trainer Ball")).click();
		driver.findElement(By.linkText("Add to cart")).click();
		System.out.println("added to cart");

		Repository base = new Repository(driver);
		base.getGotoCart().click();
		base.getIncreaseQtyInCart().click();
		
		Reporter.log("The product quantity is increased in the cart", true);
	}
}
