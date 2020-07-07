package guru.springframework.sfgdi.controllers.pets;

import guru.springframework.sfgdi.services.pets.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/28/19.
 */
@Controller
public class PetController {

    private PetService petService;

    @Autowired
    public void setPetService(PetService petService){
        this.petService = petService;
    }
    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
