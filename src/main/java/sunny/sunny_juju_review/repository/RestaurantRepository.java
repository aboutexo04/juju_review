package sunny.sunny_juju_review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sunny.sunny_juju_review.model.RestaurantEntity;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity,Long> {
}
