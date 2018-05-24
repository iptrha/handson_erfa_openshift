package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class HelloController {

    @RequestMapping("/")
    public @ResponseBody String index() {
        return "Hello World";
    }

}
