package guru.springframework.sfwdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfwdi.controllers.ConstructorInjectedController;
import guru.springframework.sfwdi.controllers.I18nController;
import guru.springframework.sfwdi.controllers.MyController;
import guru.springframework.sfwdi.controllers.PropertyInjectedController;
import guru.springframework.sfwdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfwDiApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SfwDiApplication.class, args);
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		MyController myController = (MyController) ctx.getBean("myController");
		
		//String greeting = myController.sayHello();
		
		System.out.println("-----Primary");		
		System.out.println(myController.sayHello());
		  
		System.out.println("-----Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("-----Setter");		
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");		
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("-----Constructor");		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		
		
	}

}
