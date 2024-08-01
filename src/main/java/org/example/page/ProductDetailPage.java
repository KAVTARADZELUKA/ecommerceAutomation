package org.example.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductDetailPage {
    public SelenideElement addToCartButton = $$(".self-center").last();
    public ElementsCollection productSizes = $(byText("Select Size :")).parent().$("div").$$("div");
}
