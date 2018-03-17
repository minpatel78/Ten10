package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Utils extends  BrowserFactory {

    WebDriverWait wait = new WebDriverWait(driver,AutomationConstants.TIMEOUT);

    public void waitForElementClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }



    public static void selectFromList(WebElement element, String text)
    {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for(WebElement we:options)
        {
            if (we.getText().equalsIgnoreCase(text))
            {
                select.selectByVisibleText(text);

            }
        }
    }
    public static void selectFromListByValue(WebElement element, String text)
    {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for(WebElement we:options)
        {

            if (we.getAttribute("lang").equalsIgnoreCase(text))
            {
                we.click();

            }
        }
    }
    public void scrollDownWebpage(){

        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
    }



}
