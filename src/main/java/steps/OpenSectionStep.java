package steps;

import io.cucumber.java.en.And;
import pages.OpenSectionPage;


public class OpenSectionStep {

    OpenSectionPage openSectionPage = new OpenSectionPage();

    @And("^Открываем каталог, раздел \"([^\"]*)\", далее раздел \"([^\"]*)\"$")
    public void openSectionPageCucumber(String section, String subSection) throws InterruptedException {
        openSectionPage.openCatalog();
        openSectionPage.openSection(section);
        openSectionPage.openSubSection(subSection);

    }
}
