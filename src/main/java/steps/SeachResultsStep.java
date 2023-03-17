package steps;

import io.cucumber.java.en.And;
import pages.SearchResultsPage;

public class SeachResultsStep {

    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @And("^Проверка кол.ва найденных товаров на странице и наименования товара$")
    public void AssertSeachResults() throws InterruptedException {
        searchResultsPage.assertSearchResults();
        searchResultsPage.assertNameValue();
    }
}