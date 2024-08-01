package org.example.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SignUpPage {
    public SelenideElement title = $("h1"),
            emailInput = $(byAttribute("name", "email")),
            submit = $(byAttribute("type","submit")),
            passwordInput = $(byAttribute("name", "password"));
    public ElementsCollection criteria = $(byText("Criterias -")).parent().$$("section");
    public By svg = By.tagName("svg");
}