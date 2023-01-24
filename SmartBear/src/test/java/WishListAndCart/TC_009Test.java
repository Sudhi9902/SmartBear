package WishListAndCart;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import pomRepo.Repository;

public class TC_009Test  extends Basedata {

	@Test
	public void RemooveProductFromCart() {
		/////////////////////////////// Varify that whether user is able to click on checkout on shopping  cart page

		driver.findElement(By.linkText("Soccer")).click();
		driver.findElement(By.linkText("Trainer Ball")).click();
		driver.findElement(By.linkText("Add to cart")).click();
		System.out.println("added to cart");

		Repository base = new Repository(driver);
		base.getGotoCart().click();

		base.getMovetheProductToWishlist().click();
		Reporter.log("The product checked out from the cart", true);
	}
}
