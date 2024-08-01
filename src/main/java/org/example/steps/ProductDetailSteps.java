package org.example.steps;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.SelenideElement;
import org.example.page.ProductDetailPage;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class ProductDetailSteps extends ProductDetailPage {
    public ProductDetailSteps selectSize(String size){
        productSizes.get(0).shouldBe(visible);
        for (SelenideElement element:productSizes){
            if(element.getText().equals(size)){
                element.click();
            }
        }
        return this;
    }
    public void clickAddToCart(){
        addToCartButton.shouldBe(visible).shouldBe(enabled).click(ClickOptions.usingJavaScript());
    }
}
