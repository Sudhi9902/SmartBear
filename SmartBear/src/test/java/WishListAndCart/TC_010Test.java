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
public class TC_010Test  extends Basedata {

	@Test
	public void RemooveProductFromCart() {  
		/////////////////////////////// Varify that whether user is able to remove the product from the cart

		

		driver.findElement(By.linkText("Soccer")).click();
		driver.findElement(By.linkText("Trainer Ball")).click();
		driver.findElement(By.linkText("Add to cart")).click();
		System.out.println("added to cart");

		Repository base = new Repository(driver);
		base.getGotoCart().click();
		
		base.getRemoveProductFromCart().click();
		Reporter.log("The product is removedrom the cart", true);
	}
}
