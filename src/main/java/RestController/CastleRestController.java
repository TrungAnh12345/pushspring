package RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Castle")
public class CastleRestController {

    @GetMapping("/user")
    public String activeUser(){
        return "Hello User";
    }

    @GetMapping("/admin")
    public String activeAdmin(){
        return "Hello Admin";
    }

}
