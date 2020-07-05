package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.SfgDiApplication;
import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SfgDiApplication.class)
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController controller;

   /* @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }*/

    @Test
    void getGreeting() {
        assertTrue(controller.getGreeting().equals("Hello World"));

    }
}