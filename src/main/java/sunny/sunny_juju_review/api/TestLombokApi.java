package sunny.sunny_juju_review.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
@RestController
public class TestLombokApi {

    @GetMapping("/test/lombok")
    public TestLombokResponseBody testLombok() {
        return new TestLombokResponseBody("juju",30);
    }

    @Getter
    @AllArgsConstructor
    public static class TestLombokResponseBody {
            String name;
            Integer age;

    }
}


