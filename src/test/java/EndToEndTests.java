import org.example.steps.CartSteps;
import org.example.steps.HomeSteps;
import org.example.steps.ProductDetailSteps;
import org.example.steps.ProductSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class EndToEndTests extends BaseClass{
    HomeSteps homeSteps;
    ProductSteps productSteps;
    ProductDetailSteps productDetailSteps;
    CartSteps cartSteps ;

    @BeforeClass
    void setupClass(){
        homeSteps = new HomeSteps();
        productSteps = new ProductSteps();
        productDetailSteps = new ProductDetailSteps();
        cartSteps = new CartSteps();
    }
    @Test(priority = 1)
    void selectMenCategory(){
        open("https://ecoplume-ecommerce.vercel.app/");
        homeSteps.clickMenCategory();
    }
    @Test(priority = 2)
    void addToCartFirstProduct(){
        productSteps.clickFirstProduct();
        productDetailSteps.selectSize("8").clickAddToCart();
        cartSteps.closeCartPage();
        homeSteps.goToHomePage();
    }
    @Test(priority = 3)
    void addSecondProductToCart(){
        homeSteps.clickMenCategory();
        productSteps.clickFirstProduct();
        productDetailSteps.selectSize("7").clickAddToCart();
        cartSteps.closeCartPage();
        homeSteps.goToHomePage();
    }
    @Test(priority = 4)
    void goToCheckout(){
        homeSteps.clickCart();
        cartSteps.clickCheckout();
    }
}
