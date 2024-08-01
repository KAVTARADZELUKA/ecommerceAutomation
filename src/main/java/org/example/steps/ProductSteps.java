package org.example.steps;

import com.codeborne.selenide.SelenideElement;
import org.example.page.ProductPage;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.visible;

public class ProductSteps extends ProductPage {
    public ProductSteps clickFilterButton(){
        filterButton.shouldBe(visible).click();
        return this;
    }
    public ProductSteps selectMenCategory(){
        menCategory.shouldBe(visible).click();
        return this;
    }
    public ProductSteps closeFilter(){
        closeFilterButton.click();
        closeFilterButton.shouldNotBe(visible);
        return this;
    }
    public void checkMenCategory(){
        for (SelenideElement product:products){
            Assert.assertTrue(product.$(p).getText().contains("Men"));
        }
    }

    public void clickFirstProduct() {
        products.get(0).shouldBe(visible).click();
    }
}
