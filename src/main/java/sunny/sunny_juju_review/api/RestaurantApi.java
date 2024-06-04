package sunny.sunny_juju_review.api;

import org.springframework.web.bind.annotation.*;

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
    public String createRestaurant() {
        return "This is Restaurant";
    }

    @PutMapping("/restaurants/{restaurantId}")
    public String editRestaurant(@PathVariable Long restaurantId) {
        return "This is Restaurant" + restaurantId;
    }

    @DeleteMapping("/restaurant/{restaurantId}")
    public String deleteRestaurant(@PathVariable Long restaurantId) {
        return "This is Restaurant" + restaurantId;
    }

}