package sunny.sunny_juju_review.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sunny.sunny_juju_review.model.TestEntity;
import sunny.sunny_juju_review.service.TestService;

import java.util.List;
@RequiredArgsConstructor
@RestController
public class TestQueryApi {
    private final TestService testService;
    @GetMapping("/test/query/jpa")
    public List<TestEntity> queryJpa(){
        return testService.findAllByNameByJPA("juju");
    }
    @GetMapping("/test/query/querydsl")
    public List<TestEntity> queryQuerydsl(){
        return testService.findAllByNameByQuerydsl("juju");
    }
}
