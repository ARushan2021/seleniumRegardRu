package pages;

import base.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//span[contains(@class, 'ListingLayout_count')]")
    private WebElement amount;

    @FindBy(xpath = "//div[contains(@class,'CardText_wrap__1wwDN')]/a/h6")
    private WebElement nameValue;

    ProductSearchPage productSearchPage = new ProductSearchPage();
    String amountSeachResalts = amount.getText();
    String nameFirstValue = productSearchPage.getFirstValue();
    String namevalue = nameValue.getText();

    public void assertSearchResults () {
        Assertions.assertEquals("1 товар", amountSeachResalts, "В выдаче поиска не один товар!");
    }
    public void assertNameValue () {
        Assertions.assertEquals(nameFirstValue, namevalue, "Товар введенный в поиск не совпадает с найденным товаром");

    }
}