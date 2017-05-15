
package com.example.ankitbansal.rxreviews_carwale.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Review {

    @SerializedName("reviewId")
    @Expose
    private Integer reviewId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("reviewDate")
    @Expose
    private String reviewDate;
    @SerializedName("reviewRate")
    @Expose
    private String reviewRate;
    @SerializedName("goods")
    @Expose
    private String goods;
    @SerializedName("bads")
    @Expose
    private String bads;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("reviewUrl")
    @Expose
    private String reviewUrl;
    @SerializedName("handleName")
    @Expose
    private String handleName;
    @SerializedName("threadId")
    @Expose
    private Integer threadId;
    @SerializedName("comments")
    @Expose
    private Integer comments;

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getReviewRate() {
        return reviewRate;
    }

    public void setReviewRate(String reviewRate) {
        this.reviewRate = reviewRate;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getBads() {
        return bads;
    }

    public void setBads(String bads) {
        this.bads = bads;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReviewUrl() {
        return reviewUrl;
    }

    public void setReviewUrl(String reviewUrl) {
        this.reviewUrl = reviewUrl;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        this.handleName = handleName;
    }

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

}
