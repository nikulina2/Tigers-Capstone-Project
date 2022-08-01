package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition extends Base {
	
	DesktopPageObject desktopsPage = new DesktopPageObject();

	// 1. Scenario: User verify all items are present in Desktops tab

	@When("User click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		desktopsPage.clickOnDesktopTab();
		logger.info("user clicked on Desktops tab");

	}

	@And("User click on Show all desktops")
	public void user_click_On_Show_all_desktops() {
		desktopsPage.clickOnShowAllDesktops();
		logger.info("User clicked on Show all desktops");

	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_Desktops_page() {
		List<WebElement> items = desktopsPage.elements();
		for (WebElement element : items) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("alt") + " is present on this page");
		}
		int size = items.size();
		Assert.assertEquals(size, 14);
		Utils.takeScreenShot();
		Utils.hardWait();

	}

	// 2. Scenario: User add HP LP 3065 from Desktops tab to the cart

	@And("User click  ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktopsPage.clickOnAddHPLP3065Item();
		logger.info("User clicked  ADD TO CART option");

	}

	@And("User select quantity {string}")
	public void user_select_quantity2(String string) {
		desktopsPage.selectQuantity(string);
		logger.info("User selected quantity of " + string);

	}

	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopsPage.clickOnAddToCartButton();
		logger.info("User clicked on add to Cart button");
		Utils.hardWait();

	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String expectedSuccessMessage) {
		Assert.assertEquals(desktopsPage.successMessage(), expectedSuccessMessage);
		Assert.assertTrue(desktopsPage.isSuccessMessagePresent());
		logger.info("User see a message: " + expectedSuccessMessage + " equals to " + desktopsPage.successMessage());
		Utils.takeScreenShot();
		Utils.hardWait();
	}

	// 3. Scenario: User add Canon EOS 5D from Desktops tab to the cart

	@And("User click  ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		desktopsPage.clickOnAddCanonEOS5dCameraItem();
		logger.info("User clicked  ADD TO CART option on Canon EOS 5D item");
	}

	@And("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopsPage.selectColor();
		logger.info("User selected color from dropdown Red");
	}

	@Then("User should see a message3 {string}")
	public void user_should_see_a_message3(String expectedSuccessMessage) {
		Assert.assertEquals(desktopsPage.successMessageCanon(), expectedSuccessMessage);
		Assert.assertTrue(desktopsPage.isSuccessMessagePresentCanon());
		logger.info("User see a message: " + expectedSuccessMessage + " equals to " + desktopsPage.successMessageCanon());
		Utils.takeScreenShot();
		Utils.hardWait();
	}

	// 4. Scenario: User add a review to Canon EOS 5D item in Desktops tab

	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopsPage.clickOnCanonEOS5dCameraItem();
		logger.info("User clicked on Canon EOS 5D item");
	}

	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopsPage.clickWriteAReviewLink();
		logger.info("User clicked on write a review link");
	}

	@And("User fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String,String>> rewiewInformation = dataTable.asMaps(String.class,String.class);
		desktopsPage.enterYourName(rewiewInformation.get(0).get("yourname"));
		desktopsPage.writeAReview(rewiewInformation.get(0).get("yourReview"));
		desktopsPage.selectRating(rewiewInformation.get(0).get("Rating"));
		logger.info("User filled the review information");
	}

	@And("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopsPage.clickAContinueButton();
		logger.info("User clicked on Continue Button");
		Utils.hardWait();
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String reviewSuccessMessageReview) {
		Assert.assertEquals(desktopsPage.reviewSuccessMessage(), reviewSuccessMessageReview);
		Assert.assertTrue(desktopsPage.isSuccessMessagePresentReview());
		logger.info("User see a successful message: "+ reviewSuccessMessageReview + " equals to " + desktopsPage.reviewSuccessMessage());
		Utils.takeScreenShot();
		Utils.hardWait();
	

	}
}
