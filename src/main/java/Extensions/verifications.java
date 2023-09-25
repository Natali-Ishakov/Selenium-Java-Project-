package Extensions;

import Utilities.commonOps;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class verifications extends commonOps {
    public static void testInElement(WebElement elem, String expectedValue ){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expectedValue);
    }

    public static void numberOfElements(List<WebElement> elems, int expectedValue){
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(), expectedValue);
    }
}
