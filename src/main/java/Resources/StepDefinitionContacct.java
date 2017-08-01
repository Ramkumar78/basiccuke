package Resources;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepDefinitionContacct {
    @Given("^i navigate zoo website$")
    public void i_navigate_zoo_website() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
        // Write code here that turns the phrase above into concrete actions
        FirefoxDriver driver = new FirefoxDriver();
        driver.navigate().to("http://google.com");

    }

    @When("^i click on the contact link$")
    public void i_click_on_the_contact_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^populate the contact form$")
    public void populate_the_contact_form() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^I should be on contact confirmation page$")
    public void i_should_be_on_contact_confirmation_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
