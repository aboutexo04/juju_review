package sunny.sunny_juju_review.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import sunny.sunny_juju_review.model.QTestEntity;
import sunny.sunny_juju_review.model.TestEntity;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class TestRepositoryImpl implements TestRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    @Override
    public List<TestEntity> findAllByNameByQuerydsl(String name) {
        return queryFactory.selectFrom(QTestEntity.testEntity).fetch();
    }
}
