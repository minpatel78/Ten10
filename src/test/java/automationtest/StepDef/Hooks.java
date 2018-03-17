package automationtest.StepDef;

import Page_Object.BasePage;
import Utils.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage{

    @Before
    public void setUp(){

        BrowserFactory.startBrowser();
        maximiseBrowser();
    }

    @After
    public void cleanUp(){

        BrowserFactory.stopBrowser();
    }

}
