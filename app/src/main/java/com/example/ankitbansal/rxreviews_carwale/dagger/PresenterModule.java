package com.example.ankitbansal.rxreviews_carwale.dagger;

import android.content.Context;


import com.example.ankitbansal.rxreviews_carwale.ui.review.ReviewPresenter;
import com.example.ankitbansal.rxreviews_carwale.ui.review.ReviewPresenterImpl;
import com.example.ankitbansal.rxreviews_carwale.ui.reviewz.ReviewzPresenter;
import com.example.ankitbansal.rxreviews_carwale.ui.reviewz.ReviewzPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ankit.bansal on 5/10/2017.
 */

@Module
public class PresenterModule {

    @Provides
    @Singleton
    ReviewzPresenter provideReviewzPresenter(Context context) {
        return new ReviewzPresenterImpl(context);
    }

    @Provides
    @Singleton
    ReviewPresenter provideReviewPresenter(Context context) {
        return new ReviewPresenterImpl(context);
    }
}