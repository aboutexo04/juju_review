package sunny.sunny_juju_review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sunny.sunny_juju_review.model.ReviewEntity;

public interface ReviewRepository extends JpaRepository<ReviewEntity,Long> {
}
