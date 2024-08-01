package org.example.steps;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import org.example.page.HomePage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;

public class HomeSteps extends HomePage {
    public void clickAccountImage() {
        userAccount.shouldBe(visible).click();
    }
    public void clickSearch() {
        search.shouldBe(visible).click();
    }
    public void clickMenCategory() {
        menCategory.shouldBe(exist).scrollTo().click(ClickOptions.usingJavaScript());
    }
    public void goToHomePage(){
        logo.shouldBe(visible).click();
    }

    public void clickCart() {
        cart.click();
    }
}
