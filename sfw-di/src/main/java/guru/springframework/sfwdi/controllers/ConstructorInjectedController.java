package guru.springframework.sfwdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfwdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	private final GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	

}
