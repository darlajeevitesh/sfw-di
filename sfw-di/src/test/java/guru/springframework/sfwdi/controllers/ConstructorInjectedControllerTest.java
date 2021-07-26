package guru.springframework.sfwdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfwdi.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void getGreeting() {
		//fail("Not yet implemented");
		System.out.println(controller.getGreeting());
	}

}
