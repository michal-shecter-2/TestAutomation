package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class TabelElement {

    @FindBy(how = How.XPATH, using = "//*[@id=\"customers\"]/tbody")
    private static WebElement table;

    public WebElement getTable() {
        return table;
    }


}
