package guru.springframework.sfgdi.controllers;


import guru.springframework.sfgdi.SfgDiApplication;
import guru.springframework.sfgdi.services.GreetingService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ContextConfiguration(classes = SfgDiApplication.class)
@ExtendWith(SpringExtension.class)
public class PrimaryBeanControllerTest {
    @Autowired
    private   GreetingService greetingService;

    @Test
    public void testPrimaryBean(){
        assertTrue(greetingService.sayGreeting().equals("Hello World - From the PRIMARY Bean"));
    }
}
