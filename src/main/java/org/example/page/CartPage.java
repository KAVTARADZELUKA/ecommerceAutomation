package org.example.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    public SelenideElement cross = $(".cross"),
    checkoutButton=$(byText("Proceed to checkout"));
}
