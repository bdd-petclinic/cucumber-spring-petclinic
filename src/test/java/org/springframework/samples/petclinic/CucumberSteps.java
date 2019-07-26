package org.springframework.samples.petclinic;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//https://thepracticaldeveloper.com/2017/07/31/guide-spring-boot-controller-tests/
//https://stackoverflow.com/questions/42822506/runwithcucumber-class-and-autowired-mockmvc
// https://www.google.com/search?client=safari&rls=en&q=spring+integrationtests&ie=UTF-8&oe=UTF-8

/**
 * 
 * @author marco.mangan@gmail.com
 *
 */
@ContextConfiguration(classes = PetClinicApplication.class)
public class CucumberSteps extends CucumberIntegrationTests {

	/**
	 * 
	 */
	private ResultActions results;

	@When("^I search for all pet owners$")
	public void i_search_for_all_pet_owners() throws Throwable {
		initMockMvc();
		results = mockMvc.perform(get("/owners"));

	}

	@Then("^a list of all owners is displayed$")
	public void a_list_of_all_owners_is_displayed() throws Throwable {
		results.andExpect(status().isOk()).andExpect(view().name("owners/ownersList"));
	}
	
	@Given("^a person with empty first name$")
	public void a_person_with_empty_first_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^\"([^\"]*)\" as last name$")
	public void as_last_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^person is validated$")
	public void person_is_validated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^invalid field must be \"firstName$")
	public void invalid_field_must_be_firstName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^message must be ”must not be empty\"$")
	public void message_must_be_must_not_be_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}	
	
}
