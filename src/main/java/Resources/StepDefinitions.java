package Resources;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
    @Given("^i navigate to zoo website$")
    public void shouldNavigateToZoo() throws Throwable {
        System.out.println("Test given");
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^i click on the adoption link$")
    public void i_click_on_the_adoption_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("When");
    }

    @When("^I click on the checck button$")
    public void i_click_on_the_checck_button() throws Throwable {
        System.out.println("When");
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("^I check to see that no animals are available$")
    public void i_check_to_see_that_no_animals_are_available() throws Throwable {
        System.out.println("checck no animal");
        // Write code here that turns the phrase above into concrete actions
    }
}
