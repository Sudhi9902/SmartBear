package WishListAndCart;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import pomRepo.Repository;


public class TC_003Test  extends Basedata {
	/////////////////////////////// Varify that whether user is able to remove the the product from the wishlist

	@Test
	public void RemoveProductFromWishlist() {


		driver.findElement(By.linkText("Soccer")).click();
		driver.findElement(By.linkText("Trainer Ball")).click();
		driver.findElement(By.linkText("Add to List")).click();
		System.out.println("added to wishlist");

		driver.findElement(By.linkText("View Wishlist")).click();

		Repository base = new Repository(driver);
		base.getWishlist().click();
		base.getRemoveProduct().click();
		Reporter.log("The product is Remooved from wishlist", true);
	}
}
