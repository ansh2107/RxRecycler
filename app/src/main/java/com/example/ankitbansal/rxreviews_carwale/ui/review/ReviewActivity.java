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
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


import com.example.ankitbansal.rxreviews_carwale.R;
import com.example.ankitbansal.rxreviews_carwale.app.DeezReviewzApplication;
import com.example.ankitbansal.rxreviews_carwale.app.StringUtils;
import com.example.ankitbansal.rxreviews_carwale.model.Review;
import com.example.ankitbansal.rxreviews_carwale.model.ReviewDetail;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ReviewActivity extends AppCompatActivity implements ReviewView {


  @Inject
  ReviewPresenter presenter;

  public static final String EXTRA_Review_ID = "EXTRA_Review_ID";

  public static void launch(Context context, String ReviewzItem) {
    Intent intent = new Intent(context, ReviewActivity.class);
    intent.putExtra(EXTRA_Review_ID, ReviewzItem);
    context.startActivity(intent);
  }

  @BindView(R.id.activity_Review_name)
  TextView ReviewTitle;

  @BindView(R.id.activity_Review_measure)
  TextView ReviewAuthor;

  @BindView(R.id.activity_Review_nutrient)
  TextView ReviewDate;

  @BindView(R.id.activity_Review_imageView)
  ImageView ReviewImage;

  @BindView(R.id.activity_Review_progressBar)
  ProgressBar progressBar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_review);

    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setDisplayShowHomeEnabled(true);

    ((DeezReviewzApplication)getApplication()).getAppComponent().inject(this);
    ButterKnife.bind(this);

    String ReviewId = getIntent().getStringExtra(EXTRA_Review_ID);

 //   presenter = new ReviewPresenterImpl();
    presenter.setView(this);
    presenter.getReview(ReviewId);
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case android.R.id.home:
        finish();
        return true;
    }
    return super.onOptionsItemSelected(item);
  }

  /*
   * ReviewView
   */

  @Override
  public void showLoading() {
    progressBar.setVisibility(View.VISIBLE);
  }

  @Override
  public void hideLoading() {
    progressBar.setVisibility(View.GONE);
  }



 @Override
  public void showReview(ReviewDetail Review) {
    String ReviewNameString = StringUtils.stripPrefix(Review.getTitle());
    setTitle(ReviewNameString);
    ReviewTitle.setText(ReviewNameString);
    ReviewAuthor.setText(Review.getAuthor().toString());
    ReviewDate.setText(Review.getReviewDate().toString());
 //   ReviewImage.setImageDrawable(ContextCompat.getDrawable(this, presenter.getReviewImage(Review)));
  }

  @Override
  public void showErrorMessage() {
    Toast.makeText(this, R.string.ReviewItemError, Toast.LENGTH_SHORT).show();
  }
}
