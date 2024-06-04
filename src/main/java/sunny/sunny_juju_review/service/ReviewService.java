package sunny.sunny_juju_review.service;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sunny.sunny_juju_review.model.ReviewEntity;
import sunny.sunny_juju_review.repository.RestaurantRepository;
import sunny.sunny_juju_review.repository.ReviewRepository;
import sunny.sunny_juju_review.service.dto.ReviewDto;

import java.time.ZonedDateTime;

@RequiredArgsConstructor
@Service
public class ReviewService {
    private final RestaurantRepository restaurantRepository;
    private final ReviewRepository reviewRepository;
    @Transactional
    public void createReview(Long restaurantId, String content, Double score ){
       restaurantRepository.findById(restaurantId).orElseThrow();

        ReviewEntity review = ReviewEntity.builder()
                .restaurantId(restaurantId)
                .content(content)
                .score(score)
                .createdAt(ZonedDateTime.now())
                .build();
        reviewRepository.save(review);

    }


    @Transactional
    public void deleteReview(Long reviewId){
        ReviewEntity review=reviewRepository.findById(reviewId).orElseThrow();

        reviewRepository.delete(review);
    }
    public ReviewDto getRestaurantReview(Long restaurantId, Pageable page){
        Double avgScore=reviewRepository.getAgeScoreByRestaurantId(restaurantId);
        Slice<ReviewEntity> reviews=reviewRepository.findSliceByRestaurantId(restaurantId,page);

        return ReviewDto.builder()
                .avgScore(avgScore)
                .reviews(reviews.getContent())
                .page(
                        ReviewDto.ReviewDtoPage.builder()
                                .offset(page.getPageNumber()*page.getPageSize())
                                .limit(page.getPageSize())
                                .build()
                )
                .build();



    }

}


