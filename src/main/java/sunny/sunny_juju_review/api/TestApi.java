package sunny.sunny_juju_review.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestApi {

   @GetMapping("/hello/world")
    public String helloworld(){
    return "[get]Hello world";
    }


    @PostMapping ("/hello/world")
    public String posthelloworld(){
        return "[post]Hello world";
    }


    @PutMapping("/hello/world")
    public String puthelloworld(){
        return "[put]Hello world";
    }

    @DeleteMapping("/hello/world")
    public String deletehelloworld(){
        return "[delete]Hello world";
    }
}
