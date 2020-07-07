package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.controllers.pets.PetController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootApplication(scanBasePackages ={ "guru.springframework.sfgdi.controllers.pets", "guru.springframework.sfgdi.services.pets"})
@ActiveProfiles({"dog"})
class PetControllerDogTest {

    @Autowired
    PetController petController;

    @Test
    public void test(){
        assertTrue(petController.whichPetIsTheBest().equals("Dogs are the best!"));
    }
}