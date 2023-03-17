package pages;

import base.BasePage;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class ProductSearchPage extends BasePage {

    @FindBy(xpath = "//span[@class='Pagination_countSetter__count__3f3n_']")
    private WebElement pagination24;

    @FindBy(xpath = "//div[contains(@class,'CardText_wrap__1wwDN')]/a/h6")
    private WebElement firstValueSeach;

    @FindBy(xpath = "//input[@id='searchInput']")
    private WebElement seachInput;

    String firstValue = firstValueSeach.getText();

    public String getFirstValue() {
        return firstValue;
    }


    public void assertPagination() {
        String pagination = pagination24.getText();
        Assertions.assertEquals("по 24", pagination, "Товаров на странице не 24 шт.");
    }

    public void seachFirstValue() throws InterruptedException {
        seachInput.sendKeys(firstValue);
        seachInput.sendKeys(Keys.RETURN);
        TimeUnit.SECONDS.sleep(5);
    }


}

