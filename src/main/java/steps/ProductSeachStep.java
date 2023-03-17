package steps;

import io.cucumber.java.en.And;
import pages.ProductSearchPage;

public class ProductSeachStep {

    ProductSearchPage productSearchPage = new ProductSearchPage();

    @And("^Проверка 24 товаров в выдаче поиска и поиск первого найденного товара по наименованию$")
    public void seachProd() throws InterruptedException {
        productSearchPage.assertPagination();
        productSearchPage.seachFirstValue();

    }

}

