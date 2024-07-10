package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	@Before  //Pre-Condition
	public void before() {
		System.out.println("************************");
		System.out.println("Before Method Execution");
	}
	
	@Before("@Search")  //This is how you provide a particular Pre-Condition which is specific to a scenario
	public void beforeSearch() {
		System.out.println("************************");
		System.out.println("Login code");
	}

	@After  //Post-Condition
	public void after() {
		System.out.println("After Method Execution");
		System.out.println("************************");
	}
	
}
