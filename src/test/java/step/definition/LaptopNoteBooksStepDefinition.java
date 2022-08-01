package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base{

	LaptopNoteBooksPageObject laptopNotebooksPage = new LaptopNoteBooksPageObject();
	
//	1 
	
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopNotebooksPage.clickOnLaptopsAndNotebooks();
		logger.info("User clicked on Laptop & NoteBook tab");
	}
	
	@And("User click on Show all Laptop & NoteBook option")
	public void user_clickon_show_all_laptop_note_book_option() {
		laptopNotebooksPage.clickOnShowAllLaptopsAndNotebooksTab();
		logger.info("User clicked on Show all Laptop & NoteBook option");
	}
	
	@And("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopNotebooksPage.clickOnMacBook();
		logger.info("User clicked on MacBook item");
	}
	
	@And("User click add to Cart button2")
	public void user_click_add_to_cart_button() {
		laptopNotebooksPage.clickOnAddToCartButton();
		logger.info("User clicked add to Cart button");
	}
	
	@Then("User should see a message4 {string}")
	public void user_should_see_a_message(String expectedSuccessMessage) {
		Assert.assertEquals(laptopNotebooksPage.successMessage(), expectedSuccessMessage);
		Assert.assertTrue(laptopNotebooksPage.isMacBookSuccessMessagePresent());
		logger.info("User should see a message: " + expectedSuccessMessage + " equals to " + laptopNotebooksPage.successMessage());
	}
	
	@And("User should see {string} showed to the cart")
	public void user_should_see_items_showed_to_the_cart(String expectedTotal) {
		Assert.assertEquals(laptopNotebooksPage.cartTotalValue(), expectedTotal);
		Assert.assertTrue(laptopNotebooksPage.isCartTotalIsPresent());
		logger.info("User should see: " + expectedTotal + " equals to " + laptopNotebooksPage.cartTotalValue() + " - showed to the cart");
	}
	
	@And("User click on cart option")
	public void user_click_on_cart_option() {
	  laptopNotebooksPage.clickOnCartButton();
	  logger.info("User clicked on cart option");
	}
	
	@And("User click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopNotebooksPage.clickOnXButton();
		logger.info("User clicked on red X button to remove the item from cart");
		Utils.hardWait();
	}
	
	@Then("Item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String total) {
		Assert.assertEquals(laptopNotebooksPage.cartTotalValue(), total);
		Assert.assertTrue(laptopNotebooksPage.isCartTotalIsPresent());
		logger.info("Item should be removed and cart should show: " + total + " equals to " + laptopNotebooksPage.cartTotalValue());
		Utils.takeScreenShot();
		Utils.hardWait();
	}
	
// 2
	
	@And("User click on product comparison icon on1 {string}")
	public void user_click_on_product_comparison_icon_on1(String compareMacBookIcon) {
		laptopNotebooksPage.clickOnCompareMacBook();
		logger.info("User clicked on product comparison icon on MacBook" );
	}
	
	@And("User click on product comparison icon on2 {string}")
	public void user_click_on_product_comparison_icon_on2(String compareMacBookAirIcon) {
		laptopNotebooksPage.clickOnCompareMacBookAir();
		logger.info("User clicked on product comparison icon on MacBook Air");
	}
	
	@Then("User should see a message5 {string}")
	public void user_should_see_a_message5(String expectedCompareSuccessMessage) {
		Assert.assertEquals(laptopNotebooksPage.successMessageCompare(), expectedCompareSuccessMessage);
		Assert.assertTrue(laptopNotebooksPage.isCompareSuccessMessagePresent());
		logger.info("User should see a message: " + expectedCompareSuccessMessage + " equals to " + laptopNotebooksPage.successMessageCompare());
	}
	
	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopNotebooksPage.clickOnComparisonLink();
		logger.info("User clicked on Product comparison link");
	}
	
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		Assert.assertTrue(laptopNotebooksPage.isCompareTablePresent());
		logger.info("User see Product Comparison Chart: " + laptopNotebooksPage.comparisonTableName());
		Utils.takeScreenShot();
		Utils.hardWait();
	}
	
	// 3

	@And("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String sonyVaioMessage) {
	laptopNotebooksPage.clickOnsonyVaioAddToWishButton();
	logger.info("User clicked on heart icon to add " + sonyVaioMessage + " laptop to wish list");
	}
	
	@Then("User should get a message {string}")
	public void user_should_get_a_message(String expectedMessageWishList) {
		Assert.assertEquals(laptopNotebooksPage.messageWishList(), expectedMessageWishList);
		Assert.assertTrue(laptopNotebooksPage.isWishListMessagePresent());
		logger.info("User should get a message: " + expectedMessageWishList + " equals to " + laptopNotebooksPage.messageWishList());
		Utils.takeScreenShot();
		Utils.hardWait();
	}
	
	// 4
	@And("User click on {string} item")
	public void user_click_on_item(String macBookProItem) {
		laptopNotebooksPage.clickOnMacBookProItem();
		logger.info("User clicked on MacBook Pro item");
	}
	
	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String expectesMacBookProMessage) {
		Assert.assertEquals(laptopNotebooksPage.macBookProPriceTotal(), expectesMacBookProMessage);
		Assert.assertTrue(laptopNotebooksPage.isMacBookProPriceTotalCorrect());
		logger.info("User should see " + expectesMacBookProMessage + " equals to " + laptopNotebooksPage.macBookProPriceTotal() + " price tag is present on UI.");
		Utils.takeScreenShot();
		Utils.hardWait();
	}









	



}
