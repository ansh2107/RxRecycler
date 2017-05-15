package com.example.ankitbansal.rxreviews_carwale.dagger;


import com.example.ankitbansal.rxreviews_carwale.ui.review.ReviewActivity;
import com.example.ankitbansal.rxreviews_carwale.ui.review.ReviewPresenterImpl;
import com.example.ankitbansal.rxreviews_carwale.ui.reviewz.ReviewzActivity;
import com.example.ankitbansal.rxreviews_carwale.ui.reviewz.ReviewzPresenterImpl;


import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ankit.bansal on 5/10/2017.
 */

@Singleton
@Component(modules = {AppModule.class, PresenterModule.class, NetworkModule.class})
public interface AppComponent {
    void inject(ReviewzActivity target);
    void inject(ReviewActivity target);
    void inject(ReviewzPresenterImpl target);
    void inject(ReviewPresenterImpl target);
}
