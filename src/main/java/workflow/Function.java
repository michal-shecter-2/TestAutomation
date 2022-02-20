package workflow;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;
import java.util.Objects;

public class Function {

    @Step
    public static boolean verifyTableCellText(WebElement table, int searchColumn, String searchText, int returnColumnText, String expectedText){
        try {
            String textFromFunc=getTableCellTextByXpath(table, searchColumn, searchText, returnColumnText);
            if(Objects.equals(expectedText, textFromFunc)){return true;}
        } catch (Exception e) {
            System.out.println("Test Failed" +e);
        }
        return false;
    }
    @Step
    public static String getTableCellTextByXpath(WebElement table, int searchColumn, String searchText, int returnColumnText) throws Exception {
        try {
            WebElement expected=table.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr/td["+searchColumn+"][text()=\""+searchText+"\"][contains(text(),\""+searchText+"\")]//parent::tr/td["+returnColumnText+"]"));
            return expected.getText();
        }
        catch (Exception e)   {
            throw new NoSuchElementException();
        }
    }

}
