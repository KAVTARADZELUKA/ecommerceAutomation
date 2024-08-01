import org.example.steps.ProductSteps;
import org.example.steps.HomeSteps;
import org.example.steps.SignUpSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class IntegrationTests extends BaseClass {
    HomeSteps homeSteps;
    SignUpSteps signUpSteps;
    ProductSteps filterSteps;

    @BeforeClass
    void setupClass() {
        homeSteps = new HomeSteps();
        signUpSteps = new SignUpSteps();
        filterSteps = new ProductSteps();
    }

    @Test
    void userRegistration() {
        open("https://ecoplume-ecommerce.vercel.app/");
        homeSteps.clickAccountImage();
        signUpSteps.assertSignUpPageLoaded().fillEmailAndPassword("test@gmail.com","Password@1")
                .checkCriteria().submit();
    }

    @Test
    void filter(){
        open("https://ecoplume-ecommerce.vercel.app/");
        homeSteps.clickSearch();
        filterSteps.clickFilterButton().selectMenCategory().closeFilter().checkMenCategory();
    }
}
