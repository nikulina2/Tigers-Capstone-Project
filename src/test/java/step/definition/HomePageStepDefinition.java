package step.definition;

import org.junit.Assert;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base {

	HomePageObject homePage = new HomePageObject();

	// 1
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.clickOnCurrency();
		logger.info("User clicked on Currency");

	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.clickOnEuro();
		logger.info("User Chose Euro from dropdown");

	}

	@Then("currency value should change to Euro {string}")
	public void currency_value_should_change_to_euro(String expectedCurrency) {
		Assert.assertEquals(homePage.cartTotalCurrency(), expectedCurrency);
		Assert.assertTrue(homePage.iscartTotalCurrencyCorrect());
		logger.info("Currency value is changed to " + expectedCurrency + " equals to " + homePage.cartTotalCurrency());
		Utils.takeScreenShot();
		Utils.hardWait();

	}

	// 2
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePage.clickOnShoppingCart();
		logger.info("User clicked on shopping cart");

	}

	@Then("{string} message should display")
	public void message_should_display(String expectedInfo) {
		Assert.assertEquals(homePage.shoppingCartText(), expectedInfo);
		Assert.assertTrue(homePage.isInfoAboutShoppingCartCorrect());
		logger.info(expectedInfo + " equals to " + homePage.shoppingCartText() + " - message is displayed");
		Utils.takeScreenShot();
		Utils.hardWait();

	}

}
