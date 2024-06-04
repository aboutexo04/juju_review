package sunny.sunny_juju_review.api;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sunny.sunny_juju_review.api.request.CreateReviewRequest;
import sunny.sunny_juju_review.service.ReviewService;

@RequiredArgsConstructor
@RestController
public class ReviewApi {
    private final ReviewService reviewService;

    @PostMapping("/review")
    public void createReview(@RequestBody CreateReviewRequest request){
        reviewService.createReview(request.getRestaurantId(), request.getContent(),request.getScore());
    }
    @DeleteMapping("/review/{reviewId}")
    public void deleteReview(@PathVariable("reviewId") Long reviewId){
        reviewService.deleteReview(reviewId);
    }
}


