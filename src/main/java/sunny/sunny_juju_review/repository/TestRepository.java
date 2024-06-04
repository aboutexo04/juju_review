package sunny.sunny_juju_review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sunny.sunny_juju_review.model.TestEntity;

import java.util.List;

public interface TestRepository extends JpaRepository<TestEntity, Long>,TestRepositoryCustom {

    public List<TestEntity> findAllByName(String name);
}
