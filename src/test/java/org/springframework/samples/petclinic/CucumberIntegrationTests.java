package org.springframework.samples.petclinic;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.samples.petclinic.owner.OwnerController;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest(classes = PetClinicApplication.class, webEnvironment = WebEnvironment.DEFINED_PORT)
@ContextConfiguration
public class CucumberIntegrationTests {
    protected MockMvc mockMvc;
    @Autowired
    protected OwnerController ownerRestController;
    @Before
    public void initOwners(){
    	this.mockMvc = MockMvcBuilders.standaloneSetup(ownerRestController)
    			//.setControllerAdvice(new ExceptionControllerAdvice())
    			.build();
    }
    
}
