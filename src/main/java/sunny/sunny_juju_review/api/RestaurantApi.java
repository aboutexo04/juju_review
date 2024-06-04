package sunny.sunny_juju_review.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sunny.sunny_juju_review.api.request.CreateAndEditRestaurantRequest;
import sunny.sunny_juju_review.api.response.RestaurantDetailView;
import sunny.sunny_juju_review.api.response.RestaurantView;
import sunny.sunny_juju_review.model.RestaurantEntity;
import sunny.sunny_juju_review.service.RestaurantService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RestaurantApi {
    private final RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public List<RestaurantView> getRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/restaurant/{restaurantId}")
    public RestaurantDetailView getRestaurant(@PathVariable Long restaurantId) {
        return restaurantService.getRestaurantDetail(restaurantId);
    }


    @PostMapping("/restaurant")
    public void createRestaurant(@RequestBody CreateAndEditRestaurantRequest request) {
       restaurantService.createRestaurant(request);
    }

    @PutMapping("/restaurant/{restaurantId}")
    public void editRestaurant(@PathVariable Long restaurantId,
                                 @RequestBody CreateAndEditRestaurantRequest request) {
        restaurantService.editRestaurant(restaurantId,request);
    }

    @DeleteMapping("/restaurant/{restaurantId}")
    public void deleteRestaurant(@PathVariable Long restaurantId) {
        restaurantService.deleteRestaurant(restaurantId);
    }

}