package org.example.steps;

import org.example.page.CartPage;

import static com.codeborne.selenide.Condition.visible;

public class CartSteps extends CartPage {
    public void closeCartPage(){
        cross.shouldBe(visible).click();
    }
    public void clickCheckout(){
        checkoutButton.shouldBe(visible).click();
    }
}
