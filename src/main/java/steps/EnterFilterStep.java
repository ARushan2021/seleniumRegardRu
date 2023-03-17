package steps;

import io.cucumber.java.en.And;
import pages.EnterFilterPage;

public class EnterFilterStep {

    EnterFilterPage enterFilterPage = new EnterFilterPage();

    @And("^Ставим фильтры в поиске, максимальная цена \"([^\"]*)\", производитель \"([^\"]*)\"$")
    public void EnterFilter (String minPrice, String companyName) throws InterruptedException {
        enterFilterPage.filterPrice(minPrice);
        enterFilterPage.filterCompany(companyName);
    }
}
