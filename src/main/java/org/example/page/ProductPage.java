package org.example.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductPage {
    public SelenideElement filterButton = $(byText("Filters")),
    menCategory = $(byText("Men")),
    closeFilterButton = $(".shadow-cover").$("button");
    public ElementsCollection products = $$(".shadow-normal");
    public By p = By.tagName("p");
}
