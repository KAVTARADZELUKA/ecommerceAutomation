package org.example.steps;

import com.codeborne.selenide.SelenideElement;
import org.example.page.SignUpPage;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.visible;

public class SignUpSteps extends SignUpPage {
    public SignUpSteps assertSignUpPageLoaded() {
        Assert.assertEquals(title.shouldBe(visible).getText(), "Sign Up");
        return this;
    }

    public SignUpSteps fillEmailAndPassword(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        return this;
    }

    public SignUpSteps checkCriteria() {
        criteria.get(0).shouldBe(visible);
        for (SelenideElement element : criteria) {
            Assert.assertEquals(element.$(svg).getAttribute("fill"), "currentColor");
        }
        return this;
    }

    public void submit() {
        if ( criteria.get(0).is(visible)){
            submit.click();
        }
        submit.click();
    }
}
