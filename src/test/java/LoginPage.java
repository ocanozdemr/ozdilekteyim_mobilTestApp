import com.thoughtworks.gauge.Step;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest{
    final static Logger logger = Logger.getLogger(BasePage.class.getName());
    @Step("<id> id'li elemente <text> text değerini yaz")
    public void sendKeysbyid(String id, String text){
        appiumDriver.findElement(By.id(id)).sendKeys(text);
        logger.info(text + "yazildi");
    }
}
