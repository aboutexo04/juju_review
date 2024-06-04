package sunny.sunny_juju_review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sunny.sunny_juju_review.model.MenuEntity;

import java.util.List;

public interface MenuRepository extends JpaRepository<MenuEntity,Long> {
    public List<MenuEntity> findAllByRestaurantId(Long restaurantId);

}
