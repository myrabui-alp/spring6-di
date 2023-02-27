package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetterInjectedControllerTest {
    @Autowired
    SetterInjectedController setterInjectionController;

//    @BeforeEach
//    void setUp() {
//        setterInjectionController = new SetterInjectedController();
//        setterInjectionController.setGreetingService(new GreetingServiceImpl());
//    }

    @Test
    void setGreetingService() {
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectionController.sayHello());
    }
}