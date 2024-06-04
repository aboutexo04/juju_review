package sunny.sunny_juju_review.api;

import org.springframework.web.bind.annotation.*;
import sunny.sunny_juju_review.api.request.CreateAndEditRestaurantRequest;

@RestController
public class RestaurantApi {


    @GetMapping("/restaurants")
    public String getRestaurants() {
        return "This is Restaurant";
    }

    @GetMapping("/restaurant/{restaurantId}")
    public String getRestaurant(@PathVariable Long restaurantId) {
        return "This is Restaurant" + restaurantId;
    }


    @PostMapping("/restaurant")
    public String createRestaurant(@RequestBody CreateAndEditRestaurantRequest request) {
        return "This is Restaurant"+request.getName()+request.getAddress()+request.getMenus().get(0).getName();
    }

    @PutMapping("/restaurant/{restaurantId}")
    public String editRestaurant(@PathVariable Long restaurantId,
                                 @RequestBody CreateAndEditRestaurantRequest request) {
        return "This is Restaurant" + request.getName() + request.getAddress()+restaurantId;
    }
    @DeleteMapping("/restaurant/{restaurantId}")
    public String deleteRestaurant(@PathVariable Long restaurantId) {
        return "This is Restaurant" + restaurantId;
    }

}