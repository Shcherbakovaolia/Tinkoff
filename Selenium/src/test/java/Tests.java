import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Tests {

    @org.junit.jupiter.api.Test
    public void testTranslate() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ольга\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        Driver driver = PageFactory.initElements(driver1,Driver.class);
        driver.translate();
    }


}
