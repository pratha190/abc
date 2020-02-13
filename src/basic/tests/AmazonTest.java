package basic.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basic.pages.AddressPage;
import basic.pages.AmazonHomePage;
import basic.pages.LoginPage;
import basic.pages.PaymentPage;
import basic.pages.ProductDetailPage;

/**
 * @author Pratha
 */

public class AmazonTest extends TestBase {

	@Test
	public void init() throws Exception {

		// Call all the Methods that are define in AmazonHome page
		AmazonHomePage homepage = PageFactory.initElements(driver, AmazonHomePage.class);
		homepage.setTextInSearchBox("xbox");
		Thread.sleep(1000);
		homepage.clickOnSearchButton();
		homepage.clickOnFirstSearchResult();

		// Call all the Methods that are define in ProductDetail page
		ProductDetailPage detailPage = PageFactory.initElements(driver, ProductDetailPage.class);
		detailPage.HandelProductDetailWindow();
		Thread.sleep(1000);
		detailPage.clickOnAddToCartButton();
		detailPage.clickOnProceedToBuy();

		// Call all the Methods that are define in Login page
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.setTextInEmailTextBox("8237100793");
		Thread.sleep(1000);
		loginPage.clickOnContinueButton();
		loginPage.setTextInPasswordTextBox("pratha02");
		loginPage.clickOnSignInButton();

		// Call all the Methods that are define in Address page
		AddressPage addressPage = PageFactory.initElements(driver, AddressPage.class);
		addressPage.clickOnDeliverToThisAddressButton();
		Thread.sleep(1000);
		addressPage.clickOnContinueButton();

		// Call all the Methods that are define in Payment page
		PaymentPage paymentPage = PageFactory.initElements(driver, PaymentPage.class);
		paymentPage.clickOnPaymentOption();
		Thread.sleep(1000);
		paymentPage.clickOnChooseOption();
		Thread.sleep(1000);
		paymentPage.clickOnaxisBank();
		paymentPage.clickOnContinueButton();
	}
}
