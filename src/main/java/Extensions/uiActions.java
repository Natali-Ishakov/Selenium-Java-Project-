package Extensions;

import Utilities.commonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class uiActions extends commonOps {

    public static void click(WebElement elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();

    }

    public static void upDateText(WebElement elem, String value){
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }

    public static void upDateDropDown(WebElement elem, String value){
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value);
    }

    public static void mouseHoverElements(WebElement elem1, WebElement elem2){
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

    public static void mouseHoverElement(WebElement elem1){
        action.moveToElement(elem1).click().build().perform();
    }










}
