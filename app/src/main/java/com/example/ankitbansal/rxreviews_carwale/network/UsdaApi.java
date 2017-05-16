package com.example.ankitbansal.rxreviews_carwale.network;

import com.example.ankitbansal.rxreviews_carwale.app.Constants;
import com.example.ankitbansal.rxreviews_carwale.model.Review;
import com.example.ankitbansal.rxreviews_carwale.model.ReviewsResponse;
import com.example.ankitbansal.rxreviews_carwale.model.ReviewsResponseDetail;
import com.example.ankitbansal.rxreviews_carwale.ui.review.ReviewActivity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface UsdaApi {

  @GET("UserReviews/?modelId=859&versionId=-1&pageNo=1&pageSize=10&sortCriteria=1")
  Observable<ReviewsResponse> getReviewzList();

  @GET("UserReviewDetail")
  Observable<ReviewsResponseDetail> getReviewzDetail(@Query("reviewId") String ReviewId);

}
