package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class OpenSectionPage extends BasePage {

    @FindBy(xpath = "//button[contains(@class, 'NavigationBar_burgerButton')]") //"//button[contains(@class, 'Button_primaryRed__3-T9I')]"
    private WebElement catalog;

    public void openCatalog() throws InterruptedException {
        catalog.click();
        TimeUnit.SECONDS.sleep(3);
    }
    public void openSection(String section) throws InterruptedException {
        String xpathSection = "//div[text()='" + section + "']/ancestor::a";
        driver.findElement(By.xpath(xpathSection)).click();
        TimeUnit.SECONDS.sleep(3);
    }
    public void openSubSection(String subSection) throws InterruptedException {
        String xpathSubSection = "//div/p[contains(text(),'" + subSection + "')]";
        driver.findElement(By.xpath(xpathSubSection)).click();
        TimeUnit.SECONDS.sleep(3);
    }

}



