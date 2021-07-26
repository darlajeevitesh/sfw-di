package guru.springframework.sfwdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfwdi.services.GreetingService;

@Controller
public class MyController {
	
	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayHello()
	{
		//System.out.println("Hello World");
		
		return greetingService.sayGreeting();
	}

}
