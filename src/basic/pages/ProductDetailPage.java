package basic.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Pratha
 */

public class ProductDetailPage {
	WebDriver driver;

	public ProductDetailPage(WebDriver driver) {
		this.driver = driver;
	}

	// Using FindBy for locating elements
	@FindBy(how = How.XPATH, using = "//input[@id='add-to-cart-button']")
	WebElement addToCartButton;

	@FindBy(how = How.XPATH, using = "//span[@id='hlb-ptc-btn']")
	WebElement proceedToBuy;

	// Defining all the user actions (Methods) that can be performed in the
	// Product Detail page

	// This method to click on Add To Cart Button
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

	// This method to click on Proceed To Buy Button
	public void clickOnProceedToBuy() {
		proceedToBuy.click();
	}

	public void HandelProductDetailWindow() {
		// When application switch from AmazonHome Window to ProductDetail
		// window or when browser tab is change
		String amazonHomeWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		String productDetailWindow = null;

		for (String oneWindow : allWindows) {
			if (!oneWindow.equals(amazonHomeWindow)) {
				productDetailWindow = oneWindow;

			}
		}
		// switch to another window
		driver.switchTo().window(productDetailWindow);
	}
}
