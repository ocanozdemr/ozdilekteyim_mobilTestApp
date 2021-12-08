import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

import static io.appium.java_client.touch.offset.PointOption.point;

public class ProductPage extends BaseTest{
    final static Logger logger = Logger.getLogger(BasePage.class.getName());

    @Step("Swipe up the page")
    public void swipeUp() {
        for (int i = 0; i < 2; i++) {
            int startX = 538;
            int startY = 1847;
            int endX = 538;
            int endY = 70;
            (new TouchAction(appiumDriver))
                    .press(point(startX, startY))
                    .moveTo(point(endX,endY))
                    .release()
                    .perform();
            logger.info("Sayfa aşağı kaydırıldı");

        }
    }
    @Step("Rastgele bir <key> seç")
    public void randomProduct(String key){
        List<MobileElement> elements = appiumDriver.findElements(By.xpath(key));
        Random rnd = new Random();
        int rndInt = rnd.nextInt(elements.size());
        elements.get(rndInt).click();
        logger.info("Random element secildi");
    }
}
