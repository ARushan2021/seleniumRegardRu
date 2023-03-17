package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static base.DriverManager.getWebDriver;
import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.PageFactory.initElements;

public class BasePage {


    protected static WebDriver driver = getWebDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, ofSeconds(20));

    public BasePage() {
        initElements(driver, this);
    }

}


