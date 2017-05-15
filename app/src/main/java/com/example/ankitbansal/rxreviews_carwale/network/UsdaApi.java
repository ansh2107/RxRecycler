/*
 * Copyright (c) 2016 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

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

  @GET("UserReviews/?modelId=228&versionId=-1&pageNo=1&pageSize=10&sortCriteria=1")
  Observable<ReviewsResponse> getReviewzList();

  @GET("UserReviewDetail")
  Observable<ReviewsResponseDetail> getReviewzDetail(@Query("reviewId") String ReviewId);

  /*@GET("ndb/nutrients?api_key=" + Constants.API_KEY + "&nutrients=" + Constants.SUGAR_NUTRIENT)
  Call<Review> getReviewItem(@Query("ndbno") String ReviewId);*/
}
