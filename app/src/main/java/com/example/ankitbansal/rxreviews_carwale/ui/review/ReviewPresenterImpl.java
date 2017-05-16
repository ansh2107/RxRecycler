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

package com.example.ankitbansal.rxreviews_carwale.ui.review;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.util.Log;


import com.example.ankitbansal.rxreviews_carwale.R;
import com.example.ankitbansal.rxreviews_carwale.app.Constants;
import com.example.ankitbansal.rxreviews_carwale.app.DeezReviewzApplication;
import com.example.ankitbansal.rxreviews_carwale.model.Review;
import com.example.ankitbansal.rxreviews_carwale.model.ReviewDetail;
import com.example.ankitbansal.rxreviews_carwale.model.ReviewsResponse;
import com.example.ankitbansal.rxreviews_carwale.model.ReviewsResponseDetail;
import com.example.ankitbansal.rxreviews_carwale.network.UsdaApi;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class ReviewPresenterImpl implements ReviewPresenter {

  public ReviewPresenterImpl(Context context) {
    ((DeezReviewzApplication)context).getAppComponent().inject(this);
  }
  @Inject
  UsdaApi usdaApi;
  private ReviewView view;

  @Override
  public void setView(ReviewView view) {
    this.view = view;
  }

  @Override
  public void getReview(String ReviewId) {
    view.showLoading();

      usdaApi
              .getReviewzDetail(ReviewId)
              .subscribeOn(Schedulers.newThread())
              .observeOn(AndroidSchedulers.mainThread())
              .subscribe(new Observer<ReviewsResponseDetail>() {
                  @Override
                  public void onCompleted() {

                  }
                  @Override
                  public void onError(Throwable e) {

                  }
                  @Override
                  public void onNext(ReviewsResponseDetail list) {

                      ReviewDetail foodzItems = list.getReviewDetail();

                      view.showReview(foodzItems);

                      view.hideLoading();
                  }
              });
  }




    private void showError() {
    view.showErrorMessage();
  }
}
