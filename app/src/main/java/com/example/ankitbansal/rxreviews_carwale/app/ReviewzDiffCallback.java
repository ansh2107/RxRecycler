package com.example.ankitbansal.rxreviews_carwale.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;

import com.example.ankitbansal.rxreviews_carwale.model.Review;

import java.util.List;

public class ReviewzDiffCallback extends DiffUtil.Callback{

    private final List<Review> oldList;
    private final List<Review> newList;

    public ReviewzDiffCallback(List<Review> oldList, List<Review> newList) {
        this.oldList = oldList;
        this.newList = newList;
    }

    @Override
    public int getOldListSize() {
        return oldList.size();
    }

    @Override
    public int getNewListSize() {
        return newList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldList.get(oldItemPosition).getReviewId() == newList.get(newItemPosition).getReviewId();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        final Review oldItem = oldList.get(oldItemPosition);
        final Review newItem = newList.get(newItemPosition);

        return oldItem.getTitle().equals(newItem.getTitle());
    }

    @Nullable
    @Override
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {

        final Review oldItem = oldList.get(oldItemPosition);
        final Review newItem = newList.get(newItemPosition);

        Bundle diffBundle = new Bundle();
        if (newItem.getReviewId() != oldItem.getReviewId()) {
            diffBundle.putInt("review_id", newItem.getReviewId() );
        }
        if (newItem.getTitle() != oldItem.getTitle()) {
            diffBundle.putString("review_title", newItem.getTitle());
        }
        if (newItem.getComments() != oldItem.getComments()) {
            diffBundle.putInt("review_comments", newItem.getComments());
        }
        if (diffBundle.size() == 0) return null;
        return diffBundle;


    }
}
