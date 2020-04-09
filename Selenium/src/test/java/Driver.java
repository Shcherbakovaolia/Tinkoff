
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Driver {
    private WebDriver driver;
    private final Wait<WebDriver> wait ;
    @FindBy(id = "fakeArea")
    WebElement fakeArea;

  public Driver(WebDriver driver){
      this.driver = driver;
      this.wait = new WebDriverWait(driver, 5, 1000);
  }

    //проверка функции перевода текста
    public void translate() {
        driver.get("https://translate.yandex.ru/?lang=ru-en");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(fakeArea));
        fakeArea.click();
        fakeArea.sendKeys("Привет ");


    }

}
