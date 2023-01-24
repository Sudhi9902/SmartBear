package WishListAndCart;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.Basedata;
import pomRepo.Repository;

public class TC_008Test  extends Basedata {

	@Test
	public void DecreaseProductQTYFromCart() throws InterruptedException { 
		/////////////////////////////// Varify that whether user is able to decrease the quantity of the product in the cart

		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.findElement(By.linkText("Soccer")).click();
		driver.findElement(By.linkText("Trainer Ball")).click();
		driver.findElement(By.linkText("Add to cart")).click();
		System.out.println("added to cart");

		Repository base = new Repository(driver);
		base.getGotoCart().click();
		base.getIncreaseQtyInCart().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Product')]")));
		
		base.getDecreaseQtyInCart().click();
		
		Reporter.log("The product quantity is decreased in the cart", true);
	}
}
