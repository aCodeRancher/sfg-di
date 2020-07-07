package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.SfgDiApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@ContextConfiguration(classes = SfgDiApplication.class)
@ActiveProfiles("EN")
@ExtendWith(SpringExtension.class)
class I18nControllerENTest {
    @Autowired
    I18nController i18nController;

    @Test
    public void test(){
        assertTrue(i18nController.sayHello().equals("Hello World - EN"));
    }
}