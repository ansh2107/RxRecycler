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

package com.example.ankitbansal.rxreviews_carwale.ui.reviewz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;


import com.example.ankitbansal.rxreviews_carwale.R;
import com.example.ankitbansal.rxreviews_carwale.app.DeezReviewzApplication;
import com.example.ankitbansal.rxreviews_carwale.app.StringUtils;
import com.example.ankitbansal.rxreviews_carwale.model.Review;
import com.example.ankitbansal.rxreviews_carwale.ui.review.ReviewActivity;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ReviewzActivity extends AppCompatActivity implements ReviewzView {

  @Inject
  ReviewzPresenter presenter;

  @BindView(R.id.activity_Reviewz_recyclerView)
  RecyclerView ReviewzRecyclerView;


  @BindView(R.id.activity_Reviewz_progressBar)
  ProgressBar progressBar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_reviewz);

    ((DeezReviewzApplication)getApplication()).getAppComponent().inject(this);

    ButterKnife.bind(this);

    ReviewzRecyclerView.setLayoutManager(new LinearLayoutManager(this));


    presenter.setView(this);
    presenter.getReviewz();
  }

  /*
   * ReviewzView
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
  public void showReviewz(List<Review> ReviewzItemList) {
    ReviewzRecyclerView.setAdapter(new ReviewzAdapter(ReviewzItemList));
    ReviewzRecyclerView.getAdapter().notifyDataSetChanged();
  }

  @Override
  public void showErrorMessage() {
    Toast.makeText(this, R.string.ReviewzListError, Toast.LENGTH_SHORT).show();
  }

  @Override
  public void launchReviewDetail(String ReviewzItem) {
    ReviewActivity.launch(this, ReviewzItem);
  }



  class ReviewzAdapter extends RecyclerView.Adapter<ReviewzViewHolder> {

    private List<Review> ReviewzItemList;

    ReviewzAdapter(List<Review> ReviewzItemList) {
      this.ReviewzItemList = ReviewzItemList;
    }

    @Override
    public ReviewzViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      LayoutInflater inflater = LayoutInflater.from(ReviewzActivity.this);
      return new ReviewzViewHolder(inflater.inflate(R.layout.list_item_review, parent, false));
    }

    @Override
    public void onBindViewHolder(ReviewzViewHolder holder, int position) {
      Review ReviewzItem = ReviewzItemList.get(position);
      holder.getReviewName().setText(StringUtils.stripPrefix(ReviewzItem.getTitle()));
      holder.getContainer().setOnClickListener(v -> launchReviewDetail(String.valueOf(ReviewzItem.getReviewId())));
    }

    @Override
    public int getItemCount() {
      return ReviewzItemList.size();
    }
  }
}
