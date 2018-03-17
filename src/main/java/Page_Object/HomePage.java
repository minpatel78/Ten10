package Page_Object;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends  BasePage {
     Utils myUtility;

    @FindBy(css="#searchInput")
    private WebElement searchInputField;

    @FindBy(css="#searchLanguage")
    private WebElement selectLanguageField;
    @FindBy(css=".pure-button.pure-button-primary-progressive")
    private WebElement submmitSearchButtonField;
    @FindBy(css="#firstHeading")
    private WebElement headingField;
    @FindBy(css=".mw-interlanguage-selector")
    private WebElement interLangLinkButtonField;
    @FindBy(css=".interlanguage-link.interwiki-simple")
    private WebElement interLangLinkEnglishField;



    public HomePage()
    {
        myUtility=new Utils();
        PageFactory.initElements(driver, this);
    }

    public boolean isOnMainPage() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        return driver.getCurrentUrl().contains("org");
    }

    public boolean isSearchTextBoxDisplayed()
    {
        myUtility.waitForElementVisible(searchInputField);
        return  searchInputField.isDisplayed();
    }

    public boolean checkHeadingIsDisplayed(String heading)
    {

        return headingField.isDisplayed();
    }
    public boolean isLangChangeLinkDisplayed()
    {       myUtility.waitForElementVisible(interLangLinkButtonField);
               return interLangLinkButtonField.isDisplayed();

    }

    public void inputSearchText(String searchword) {

    if(isSearchTextBoxDisplayed())
    {
        searchInputField.sendKeys(searchword);
    }

    }

    public void selectLang(String language) {

        String str1=language.substring(0,2).toLowerCase();

        myUtility.selectFromListByValue(selectLanguageField,str1);
}

    public void submitSearch() {
        myUtility.waitForElementClickable(submmitSearchButtonField);
        submmitSearchButtonField.click();

    }


}
