package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.SfgDiApplication;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SfgDiApplication.class)
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController controller;

   /*@BeforeEach
    public void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }*/

    @Test
    void getGreeting() {

        assertTrue(controller.getGreeting().equals("Hello World - Constructor"));

    }
}