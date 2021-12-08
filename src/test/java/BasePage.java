import com.thoughtworks.gauge.Step;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BasePage extends BaseTest{
    final static Logger logger = Logger.getLogger(BasePage.class.getName());

    @Step("<wait> saniye bekle")
    public void waitForsecond(int wait) throws InterruptedException {
        Thread.sleep(1000*wait);
        logger.info(wait + " saniye bekledi");

    }
    @Step("<selectorid> id'li elemente tıkla")
    public void clickByid(String selectorid){
        appiumDriver.findElement(By.id(selectorid)).click();
        logger.info(" id elementine gidildi");
    }
    @Step("<selectorid> xPath'li elemente tıkla")
    public void clickByxPath(String selectorid){
        appiumDriver.findElement(By.xpath(selectorid)).click();
        logger.info("xpath elementine gidildi");
    }

    @Step("<key> id'li element <keyword> text değerini içerdiğini kontrol et")
    public void textControl(String key,String keyword){
        Assert.assertTrue("Elementi içermiyor",appiumDriver.findElement(By.id(key)).getText().contains(keyword));
        logger.info(keyword + "elementi kontrol edildi" );
    }
    @Step("<key> xPath'li element <keyword> text değerini içerdiğini kontrol et")
    public void textContolxPath(String key,String keyword){
        Assert.assertTrue("Elementi içermiyor",appiumDriver.findElement(By.xpath(key)).getText().contains(keyword));
        logger.info(keyword +  "text li element kontrol edildi");
    }



}
