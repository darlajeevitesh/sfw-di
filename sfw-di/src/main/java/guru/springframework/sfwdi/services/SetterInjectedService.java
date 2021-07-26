package guru.springframework.sfwdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedService implements GreetingService {
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - Setter";
	}

}
