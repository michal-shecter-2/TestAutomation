package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageObjects.TabelElement;

public class CommonOps extends Base{

    @BeforeClass
    public void openChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(ReadData.getData("Url"));
        elements= PageFactory.initElements(driver, TabelElement.class);
    }
    @AfterClass
    public void closeSession() {
        driver.quit();
    }
}
