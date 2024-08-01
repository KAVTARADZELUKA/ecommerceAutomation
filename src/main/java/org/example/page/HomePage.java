package org.example.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public SelenideElement userAccount = $(".user-account"),
            menCategory = $(byText("Shop Men")),
            logo = $(byAttribute("alt","Logo Of EcoPlume")),
            cart = $(".cart"),
            search = $(".search");
}
