package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class EnterFilterPage extends BasePage {

    @FindBy(xpath = "//div[2]/div/div/div/div/div/div/div[1]/section/div[2]/div/div/div/div/input[@name='min']")
    private WebElement filterprice;

    public void filterPrice(String minPrice) throws InterruptedException {
        filterprice.sendKeys(minPrice);
        TimeUnit.SECONDS.sleep(3);
    }
    public void filterCompany(String companyName)throws InterruptedException {
        String xpathCompanyName = "//label[text()='" + companyName + "']";
        driver.findElement(By.xpath(xpathCompanyName)).click();
        TimeUnit.SECONDS.sleep(7);

    }
}
