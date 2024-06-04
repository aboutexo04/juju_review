package sunny.sunny_juju_review.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestRequestApi {

    @GetMapping("/test/param")
    public String requestParam(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return "Hello, Request Param, I am " + name + ", " + age;
    }

    @GetMapping("/test/path/{name}/{age}")
    public String requestPathVariable(@PathVariable("name") String name, @PathVariable("age") Integer age) {
        return "Hello, path variable, I am " + name + ", " + age;

    }

    @PostMapping("/test/body")
    public String requestbody(@RequestBody TestRequestBody request) {
        return "Hello, request body, I am " + request.name+", "+request.age+"years old.";
    }

    public static class TestRequestBody{
        String name;
        Integer age;

        public TestRequestBody(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
}

