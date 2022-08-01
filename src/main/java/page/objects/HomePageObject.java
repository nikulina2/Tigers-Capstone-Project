package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	/**
	 * In this class we will store all UI Elements that belongs to Home page of this
	 * application.
	 */

	/**
	 * We will use PageFactory Class to initialize the UI elements we store in this
	 * class. PageFactory class provides a method called .initElements and this
	 * method job is to initialize all UI (User Interface) Elements.
	 */
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	// 1 OBJECTS

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyTab;

	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement euro;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement shoppingCart;

	// 2 OBJECTS
	@FindBy(xpath = "//p[@class='text-center']")
	private WebElement infoAboutShoppingCart;

	// 1 METHODS
	public void clickOnCurrency() {
		currencyTab.click();
	}

	public void clickOnEuro() {
		euro.click();
	}

	public String cartTotalCurrency() {
		String actualResult = shoppingCart.getText();
		return actualResult;
	}

	public boolean iscartTotalCurrencyCorrect() {
		if (shoppingCart.isDisplayed())
			return true;
		else
			return false;
	}

	// 2 METHODS
	public void clickOnShoppingCart() {
		shoppingCart.click();
	}

	public String shoppingCartText() {
		String actualResult = infoAboutShoppingCart.getText();
		return actualResult;
	}

	public boolean isInfoAboutShoppingCartCorrect() {
		if (infoAboutShoppingCart.isDisplayed())
			return true;
		else
			return false;
	}

}
