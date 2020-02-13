package basic.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Pratha
 */

public class PaymentPage {

	WebDriver driver;

	public PaymentPage(WebDriver driver) {
		this.driver = driver;
	}

	// Using FindBy for locating elements
	@FindBy(how = How.XPATH, using = "//input[contains(@name,'ppw-instrumentRowSelection')]")
	List<WebElement> radioPaymentOption;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Choose an Option')]")
	WebElement chooseOption;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Axis Bank')]")
	WebElement axisBank;

	@FindBy(how = How.XPATH, using = "//input[contains(@aria-labelledby,'135')]")
	WebElement continueButton;

	// This method to click on Payment Option
	public void clickOnPaymentOption() {
		for (int i = 0; i < radioPaymentOption.size(); i++) {
			WebElement paymentOptions = radioPaymentOption.get(i);
			String value = paymentOptions.getAttribute("value");
			if (value.equalsIgnoreCase("Net Banking")) {
				paymentOptions.click();
			}
		}
	}

	// Defining all the user actions (Methods) that can be performed in the
	// Payment page

	// This method to click on choose option
	public void clickOnChooseOption() {
		chooseOption.click();
	}

	// This method to click on AxisBank option
	public void clickOnaxisBank() {
		axisBank.click();
	}

	// This method to click on Continue Button
	public void clickOnContinueButton() {
		continueButton.click();
	}
}
