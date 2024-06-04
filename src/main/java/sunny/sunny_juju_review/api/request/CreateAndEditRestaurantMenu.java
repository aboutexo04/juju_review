package sunny.sunny_juju_review.api.request;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public class CreateAndEditRestaurantMenu {

    private final String name;
    private final Integer price;
}
