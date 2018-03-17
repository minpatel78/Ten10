package automationtest.StepDef;

import Page_Object.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchResultSteps {
    private HomePage homePage;
    @Given("^user on Main Page$")
    public void user_on_main_page()  {
    homePage=new HomePage();
        assertThat(homePage.isOnMainPage(), is(true));
    }
    @When("^user Type search item as \"([^\"]*)\"$")
    public void user_type_search_item_as_something(String searchword) {
        homePage.inputSearchText(searchword);

    }

    @When("^user select Language as \"([^\"]*)\"$")
    public void user_select_language_as_something(String language)  {

        homePage.selectLang(language);


    }


    @When("^user submit$")
        public void user_submit() {
        homePage.submitSearch();
    }
    @Then("^I user should see search result set \"([^\"]*)\"$")
    public void i_user_should_see_search_result_set(String searchterm)  {
        assertThat(homePage.checkHeadingIsDisplayed(searchterm),is(true));
        assertThat(homePage.isLangChangeLinkDisplayed(),is(true));

    }



}
