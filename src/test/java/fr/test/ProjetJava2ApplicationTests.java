package fr.test;

import fr.test.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProjetJava2Application.class)
@WebAppConfiguration
public class ProjetJava2ApplicationTests {

	@Autowired
	private CustomerService customerService;

	@Test
	public void contextLoads() {
		customerService.getCustomer(1l);
	}

}
