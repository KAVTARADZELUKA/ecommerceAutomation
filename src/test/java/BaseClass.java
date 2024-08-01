import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
    @BeforeSuite
    void setup(){
        Configuration.browserSize = "1920x1080";
    }
}
