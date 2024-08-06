package Controllers;

import Entities.ReadJson;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReadJsonController {

    @RequestMapping(value = "/saveReadMessage", method = RequestMethod.POST)

        public String saveReadMessage (@RequestBody ReadJson readJson){
        System.out.println(readJson);
        return "Mensaje recibido: " + readJson;
    }

}