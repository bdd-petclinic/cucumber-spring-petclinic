package org.springframework.samples.petclinic;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.ResultActions;

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
}