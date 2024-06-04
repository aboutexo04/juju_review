package sunny.sunny_juju_review.repository;

import sunny.sunny_juju_review.model.TestEntity;

import java.util.List;

public interface TestRepositoryCustom {

    public List<TestEntity> findAllByNameByQuerydsl(String name);
}
