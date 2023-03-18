package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static base.DriverManager.getWebDriver;
import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.PageFactory.initElements;
import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOf;

public class BasePage {

    @FindBy(xpath = "//svg[@class='Spinner_icon__1y9mU']/circle")
    private WebElement loadingIcon;


    protected static WebDriver driver = getWebDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, ofSeconds(20));

    public BasePage() {
        initElements(driver, this);
    }

    public void loading() {
        wait.until(invisibilityOf(loadingIcon));
    }

}


