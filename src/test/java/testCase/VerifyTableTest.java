package testCase;

import io.qameta.allure.Description;
import utilities.CommonOps;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ReadData;
import workflow.Function;

public class VerifyTableTest extends CommonOps {

    @Test(priority = 1)
    @Description("Verify table cell text")
        public void testVerifyTableCellText(){
        Assert.assertTrue(Function.verifyTableCellText(CommonOps.elements.getTable(),Integer.parseInt(ReadData.getData("searchColumn"))
                , ReadData.getData("searchText"),
                Integer.parseInt(ReadData.getData("returnColumnText")),
                ReadData.getData("expectedText")));
    }
}
