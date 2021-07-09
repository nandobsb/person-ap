package digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping(path = "/api/person")
    public String check() {
        return  "Fernando esta online";
    }
}
