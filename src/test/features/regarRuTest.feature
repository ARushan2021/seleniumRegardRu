@all
@severity=blocked
Feature: RegardRu

  @ProductSearch
  Scenario Outline: ProductSearchScenario
    And Открываем каталог, раздел "<section>", далее раздел "<subSection>"
    And Ставим фильтры в поиске, максимальная цена "<minPrice>", производитель "<companyName>"
    And Проверка 24 товаров в выдаче поиска и поиск первого найденного товара по наименованию

    Examples:
      | section     | subSection |minPrice|companyName|
      | Комплектующие для ПК| Видеокарты|20000|Gigabyte|
      |Периферия            |Клавиатуры |2000|A4Tech|







