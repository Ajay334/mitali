package stepdefinations.stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinations {

    @Given("^User is banking website$")
    public void user_is_banking_website() throws Throwable {
        throw new PendingException();
    }

    @When("^User will login to application with username and password$")
    public void user_will_login_to_application_with_username_and_password() throws Throwable {
        throw new PendingException();
    }

    @Then("^homepage is populated$")
    public void homepage_is_populated() throws Throwable {
        throw new PendingException();
    }

    @And("^cards are displayed$")
    public void cards_can_be_displayed() throws Throwable {
        throw new PendingException();
    }

}