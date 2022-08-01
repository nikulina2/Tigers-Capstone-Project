package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	// 1 OBJECTS
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooksTab;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooksTab;
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookItem;
	
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "(//a[text()='MacBook'])[3]")
	private WebElement macBookSuccessMessage;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartButton;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement xButton;
	
	//2 OBJECTS
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[2]")
	private WebElement compareMacBookIcon;
	
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[3]")
	private WebElement compareMacBookAirIcon;
	
	@FindBy(xpath = "(//a[text()='MacBook Air'])[1]")
	private WebElement compareSuccsessMessage;
	
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement comparisonLink;
	
	@FindBy(xpath = "//div/h1[text()='Product Comparison']")
	private WebElement productComparisonChart;
	
	//3 OBJECTS
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement sonyVaioAddToWishButton;
	
	@FindBy(xpath = "(//a[text()='Sony VAIO'])[1]")
	private WebElement sonyVaioMessage;
	
	//4 OBJECTS
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookProItem;
	
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement macBookProPrice;
	

	// 1 METHODS
	public void clickOnLaptopsAndNotebooks() {
		Actions action = new Actions(driver);
		action.moveToElement(laptopsAndNotebooksTab).build().perform(); 
	}

	public void clickOnShowAllLaptopsAndNotebooksTab() {
		showAllLaptopsAndNotebooksTab.click();
	}
	
	public void clickOnMacBook() {
		macBookItem.click();
	}
	
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

		public String successMessage() {
			String actualResult = "Success: You have added " + macBookSuccessMessage.getText() + " to your shopping cart!";
			return actualResult;
		}

		public boolean isMacBookSuccessMessagePresent() {
			if (macBookSuccessMessage.isDisplayed())
				return true;
			else
				return false;
		}

		public String cartTotalValue() {
			String actualResult = cartButton.getText();
			return actualResult;
		}

		public boolean isCartTotalIsPresent() {
			if (cartButton.isDisplayed())
				return true;
			else
				return false;
		}
		
		public void clickOnCartButton() {
			cartButton.click();
		}
		
		public void clickOnXButton() {
			xButton.click();
		}
		
		// 2 METHODS
		public void clickOnCompareMacBook() {
			compareMacBookIcon.click();
		}
		
		public void clickOnCompareMacBookAir() {
			compareMacBookAirIcon.click();
		}
		
		public String successMessageCompare() {
			String actualResult = "Success: You have added " + compareSuccsessMessage.getText() + " to your product comparison!";
			return actualResult;
		}

		public boolean isCompareSuccessMessagePresent() {
			if (compareSuccsessMessage.isDisplayed())
				return true;
			else
				return false;
		}
		
		public void clickOnComparisonLink() {
			comparisonLink.click();
		}
		
		public String comparisonTableName() {
			String actualResult = productComparisonChart.getText();
			return actualResult;
		}
	
		
		public boolean isCompareTablePresent() {
			if (productComparisonChart.isDisplayed())
				return true;
			else
				return false;
		}
		
		// 3 METHODS
		
		public void clickOnsonyVaioAddToWishButton() {
			sonyVaioAddToWishButton.click();
		}
		
		public String messageWishList() {
			String actualResult = "You must login or create an account to save " + sonyVaioMessage.getText() + " to your wish list!";
			return actualResult;
		}

		public boolean isWishListMessagePresent() {
			if (sonyVaioMessage.isDisplayed())
				return true;
			else
				return false;
		}
		
		// 4 METHODS
		
		public void clickOnMacBookProItem() {
			macBookProItem.click();
		}
		
		public String macBookProPriceTotal() {
			String actualResult = macBookProPrice.getText();
			return actualResult;
		}

		public boolean isMacBookProPriceTotalCorrect() {
			if (macBookProPrice.isDisplayed())
				return true;
			else
				return false;
		}
		
		
	
		
		

	
}
