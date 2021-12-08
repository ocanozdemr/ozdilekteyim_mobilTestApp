import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class ProductDetailPage extends BaseTest{
    final static Logger logger = Logger.getLogger(BasePage.class.getName());
    @Step("Rastgele bir <size> eklenir")
    public void AddRandomSize(String size){
        List<MobileElement> elements = appiumDriver.findElements(By.id(size));
        Random rnd = new Random();
        int rndInt = rnd.nextInt(elements.size());
        elements.get(rndInt).click();
        logger.info("id li listeden rastgele bir beden seçildi");

    }
}
